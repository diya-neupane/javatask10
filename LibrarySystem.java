// Interface
interface LibraryItem {
    String getTitle();
    String getAuthor();
    int getYear();
    boolean isAvailable();
}

// Book class implementing LibraryItem
class Book implements LibraryItem {
    private String title;
    private String author;
    private int year;
    private boolean available;

    Book(String title, String author, int year, boolean available) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = available;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}

// Magazine class implementing LibraryItem
class Magazine implements LibraryItem {
    private String title;
    private String author;
    private int year;
    private boolean available;

    Magazine(String title, String author, int year, boolean available) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = available;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}

// Main class to demonstrate
public class LibrarySystem {
    public static void main(String[] args) {
        LibraryItem book = new Book("To Kill a Mockingbird", "Harper Lee", 1960, true);
        LibraryItem magazine = new Magazine("National Geographic", "Various Authors", 2023, false);

        System.out.println("Book:");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Year: " + book.getYear());
        System.out.println("Available: " + book.isAvailable());

        System.out.println("\nMagazine:");
        System.out.println("Title: " + magazine.getTitle());
        System.out.println("Author: " + magazine.getAuthor());
        System.out.println("Year: " + magazine.getYear());
        System.out.println("Available: " + magazine.isAvailable());
    }
}
