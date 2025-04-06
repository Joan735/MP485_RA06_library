package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import static main.Library.inventory;

public class FileManager {

    private static final String PROYECT_ROUTE = System.getProperty("user.dir");
    private static final String SEPARATOR = File.separator;
    private static final String FOLDER_ROUTE = PROYECT_ROUTE + SEPARATOR + "folder";
    private static final String FILE_ROUTE = FOLDER_ROUTE + SEPARATOR + "books";
    private static final String LS = System.getProperty("line.separator");

    private static final File FOLDER = new File(FOLDER_ROUTE);
    private static final File FILE = new File(FILE_ROUTE);

    public static void createRoute() throws IOException {
        if (!FOLDER.exists()) {
            FOLDER.mkdir();
            System.out.println("[ FOLDER CREATED ]");
        } else {
            System.out.println("- FOLDER ALREADY EXIST -");
        }
        if (!FILE.exists()) {
            FILE.createNewFile();
            System.out.println("[ FILE CREATED ]");
        } else {
            System.out.println("- FILE ALREADY EXIST -");
        }
    }

    public static void saveData() throws IOException, NullPointerException {
        if (FILE.exists()) {
            FileReader fr = new FileReader(FILE);
            BufferedReader br = new BufferedReader(fr);
            String data[];
            String authors[];
            ArrayList<String> authorList = new ArrayList<>();
            String line = br.readLine();
            if (line != null) {
                while (line != null) {
                    data = line.split("; ");
                    authors = data[2].split(", ");
                    for (int i = 0; i < authors.length; i++) {
                        authorList.add(authors[i]);
                    }
                    inventory.put(data[1], new Book(data[0], data[1], authorList, Double.parseDouble(data[3]), Integer.parseInt(data[4])));
                    line = br.readLine();
                }
                br.close();
                System.out.println("[ DATA SAVED ]");
            }else{
                System.out.println("- FILE IS EMPTY -");
            }
        } else {
            System.out.println("- FILE DOESN'T EXIST -");
        }
    }

    // He creado varias variables para que tenga controlado todo a la hora de añadir al archivo.
    public static void fileWriter() throws IOException {
        if (FILE.exists()) {
            FileWriter fw = new FileWriter(FILE);
            BufferedWriter bw = new BufferedWriter(fw);
            String text = "";
            int contador = 0;
            ArrayList<String> authorList;
            String authors = "";
            Book book;
            Iterator it = inventory.keySet().iterator();
            while (it.hasNext()) {
                String key = (String) it.next();
                book = inventory.get(key);
                authorList = book.getAuthor();
                for (int i = 0; i < authorList.size(); i++) {
                    if (i != (authorList.size() - 1)) {
                        authors += authorList.get(i) + ", ";
                    } else {
                        authors += authorList.get(i);
                    }
                }
                if (contador == 0) {
                    text = book.getTitle() + "; " + book.getISBN() + "; " + authors + "; " + book.getPrice() + "; " + book.getQuantity();
                    contador = 1;
                } else {
                    text += LS + book.getTitle() + "; " + book.getISBN() + "; " + authors + "; " + book.getPrice() + "; " + book.getQuantity();
                }
            }
            bw.write(text);
            bw.flush();
            bw.close();
            System.out.println("[ FILE EDITED ]");
        } else {
            System.out.println("- FILE DOESN'T EXIST -");
        }
    }

    public static String fileReader() throws IOException, NullPointerException {
        String text = "";
        if (FILE.exists()) {
            FileReader fr = new FileReader(FILE);
            BufferedReader br = new BufferedReader(fr);
            int contador = 0;
            String line = br.readLine();
            while (line != null) {
                if (contador == 0) {
                    text = line;
                    line = br.readLine();
                    contador = 1;
                } else {
                    text += LS + line;
                    line = br.readLine();
                }
            }
            br.close();
            System.out.println("[ FILE READ ]");
        } else {
            System.out.println("- FILE DOESN'T EXIST -");
        }
        return text;
    }
}
