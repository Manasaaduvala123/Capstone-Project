package day9_Assessments;
import java.util.*;
class Book implements Comparable<Book> {
 private int bookId;
 private String title;
 private String author;

 public Book(int bookId, String title, String author) {
     this.bookId = bookId;
     this.title = title;
     this.author = author;
 }
 public int getBookId() {
     return bookId;
 }
 public String getTitle() {
     return title;
 }
 public String getAuthor() {
     return author;
 }
 public int compareTo(Book other) {
     return Integer.compare(this.bookId, other.bookId);
 }
 public String toString() {
     return "BookID: " + bookId + ", Title: " + title + ", Author: " + author;
 }
}
public class BookSortingDemo {
 public static void main(String[] args) {
     List<Book> books = new ArrayList<>();
     books.add(new Book(103, "Java Programming", "John Smith"));
     books.add(new Book(101, "Data Structures", "Alice Johnson"));
     books.add(new Book(105, "Algorithms", "Bob Williams"));
     books.add(new Book(102, "Java Programming", "Charlie Brown"));
     Collections.sort(books);
     System.out.println("Sorted by Book ID (Ascending):");
     books.forEach(System.out::println);
     books.sort(Comparator
             .comparing(Book::getTitle)
             .thenComparing(Book::getAuthor));
     System.out.println("\nSorted by Title, then Author:");
     books.forEach(System.out::println);
 }
}
