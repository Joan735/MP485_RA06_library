package main;

import java.util.ArrayList;
import java.util.Objects;

public class Book {
    private String title;
    private String ISBN;
    private ArrayList<String> author;
    private double price;
    private int quantity;

    public Book(String title, String ISBN, ArrayList<String> author, double price, int quantity) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public Book(String title) {
        this.title = title;
    }
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public ArrayList<String> getAuthor() {
        return author;
    }

    public void setAuthor(ArrayList<String> author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
   
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.title);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        return Objects.equals(this.title, other.title);
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", ISBN=" + ISBN + ", author=" + author + ", price=" + price + ", quantity=" + quantity + '}';
    }
    
}
