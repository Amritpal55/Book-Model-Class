// Main.java
// Author: Amritpal Singh
// Student ID: 200599539

public class Main {
    public static void main(String[] args) {
        // Create a book object for "The God of Small Things"
        Book book = new Book("The God of Small Things", "Arundhati Roy", 1997, "9780006550686", 336, "Fiction", "English");

        // Add awards won by the book
        book.addAward("Man Booker Prize (1997)");
        book.addAward("National Book Critics Circle Award (1997)");

        // Display book details
        System.out.println(book);

        // Test invalid input (this will throw an exception)
        try {
            Book invalidBook = new Book("", "Anonymous", -100, "123", 0, "", ""); // Invalid title, year, ISBN, etc.
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}