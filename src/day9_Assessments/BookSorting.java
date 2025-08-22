package day9_Assessments;
import java.util.*;
class Book implements Comparable<Book> {
    private int bookId;
    private String title;
    public Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
    }
    public int getBookId() {
        return bookId;
    }
    public String getTitle() {
        return title;
    }
    public int compareTo(Book other) {
        return Integer.compare(other.bookId, this.bookId); // Reverse order
    }
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title;
    }
}
public class BookSorting{
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(105, "Java Programming"));
        books.add(new Book(102, "Data Structures"));
        books.add(new Book(110, "Algorithms"));
        books.add(new Book(101, "Operating Systems"));
        System.out.println("Before sorting:");
        for (Book b : books) {
            System.out.println(b);
        }
        Collections.sort(books);
        System.out.println("\nAfter sorting by bookId (Descending):");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
