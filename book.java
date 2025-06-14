class Book {
    protected String title;
    protected String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class FictionBook extends Book {
    public FictionBook(String title, String author) {
        super(title, author);
    }
}

class NonFictionBook extends Book {
    public NonFictionBook(String title, String author) {
        super(title, author);
    }
}

class TechnicalBook extends Book {
    public TechnicalBook(String title, String author) {
        super(title, author);
    }
}

public class book {
    public static void main(String[] args) {
        FictionBook fiction = new FictionBook("The Alchemist", "Paulo Coelho");
        NonFictionBook nonFiction = new NonFictionBook("Sapiens", "Yuval Noah Harari");
        TechnicalBook technical = new TechnicalBook("Java Programming", "James Gosling");

        System.out.println("Fiction Book Details:");
        fiction.displayDetails();

        System.out.println("\nNon-Fiction Book Details:");
        nonFiction.displayDetails();

        System.out.println("\nTechnical Book Details:");
        technical.displayDetails();
    }
}
