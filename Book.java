// Book.java
// Author: Amritpal Singh
// Student ID: 200599539

import java.util.List;
import java.util.ArrayList;

public class Book {
    // Instance variables
    private String title;
    private String author;
    private int yearPublished;
    private String isbn;
    private int pageCount;
    private String genre;
    private String language;
    private List<String> awards; // List of awards won by the book

    // Constructor
    public Book(String title, String author, int yearPublished, String isbn, int pageCount, String genre, String language) {
        setTitle(title);          // Validate title
        setAuthor(author);        // Validate author
        setYearPublished(yearPublished); // Validate year
        setIsbn(isbn);            // Validate ISBN
        setPageCount(pageCount);  // Validate page count
        setGenre(genre);          // Validate genre
        setLanguage(language);    // Validate language
        this.awards = new ArrayList<>(); // Initialize awards list
    }

    // Setter for title with validation
    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty.");
        }
        this.title = title;
    }

    // Setter for author with validation
    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Author cannot be null or empty.");
        }
        this.author = author;
    }

    // Setter for yearPublished with validation
    public void setYearPublished(int yearPublished) {
        if (yearPublished < 0 || yearPublished > 2023) {
            throw new IllegalArgumentException("Year published must be between 0 and 2023.");
        }
        this.yearPublished = yearPublished;
    }

    // Setter for ISBN with validation
    public void setIsbn(String isbn) {
        if (isbn == null || isbn.trim().isEmpty() || isbn.length() != 13) {
            throw new IllegalArgumentException("ISBN must be a 13-character string.");
        }
        this.isbn = isbn;
    }

    // Setter for pageCount with validation
    public void setPageCount(int pageCount) {
        if (pageCount < 1) {
            throw new IllegalArgumentException("Page count must be at least 1.");
        }
        this.pageCount = pageCount;
    }

    // Setter for genre with validation
    public void setGenre(String genre) {
        if (genre == null || genre.trim().isEmpty()) {
            throw new IllegalArgumentException("Genre cannot be null or empty.");
        }
        this.genre = genre;
    }

    // Setter for language with validation
    public void setLanguage(String language) {
        if (language == null || language.trim().isEmpty()) {
            throw new IllegalArgumentException("Language cannot be null or empty.");
        }
        this.language = language;
    }

    // Method to add an award
    public void addAward(String award) {
        if (award == null || award.trim().isEmpty()) {
            throw new IllegalArgumentException("Award cannot be null or empty.");
        }
        this.awards.add(award);
    }

    // Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYearPublished() { return yearPublished; }
    public String getIsbn() { return isbn; }
    public int getPageCount() { return pageCount; }
    public String getGenre() { return genre; }
    public String getLanguage() { return language; }
    public List<String> getAwards() { return awards; }

    // Override toString() for better object representation
    @Override
    public String toString() {
        return "📖 Book Details 📖\n" +
                "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Year Published: " + yearPublished + "\n" +
                "ISBN: " + isbn + "\n" +
                "Page Count: " + pageCount + "\n" +
                "Genre: " + genre + "\n" +
                "Language: " + language + "\n" +
                "Awards: " + awards + "\n" +
                "--------------------------";
    }
}