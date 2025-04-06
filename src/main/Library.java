package main;

import frames.Menu;
import java.io.IOException;
import java.util.HashMap;

public class Library {

    public static HashMap<String, Book> inventory = new HashMap<>();

    public static void main(String[] args) {

        Menu menu = new Menu();
        try {
            FileManager.createRoute();
        } catch (IOException ex) {
            System.out.println("- ERROR WHILE CREATING FOLDER AND FILE -");
        }
        try {
            FileManager.saveData();
        } catch (IOException ex) {
            System.out.println("- ERROR WHILE SAVING DATA -");
        } catch (NullPointerException EX) {
            System.out.println("- FILE IS EMPTY -");
        }
        menu.setVisible(true);
    }

}
