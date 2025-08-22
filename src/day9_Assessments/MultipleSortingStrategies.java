package day9_Assessments;
import java.util.*;
class Product {
 private String name;
 private double price;
 public Product(String name, double price) {
     this.name = name;
     this.price = price;
 }
 public String getName() {
     return name;
 }
 public double getPrice() {
     return price;
 }
 public String toString() {
     return name + " - ₹" + price;
 }
}
class PriceAscendingComparator implements Comparator<Product> {
 public int compare(Product p1, Product p2) {
     return Double.compare(p1.getPrice(), p2.getPrice());
 }
}
class PriceDescendingComparator implements Comparator<Product> {
 public int compare(Product p1, Product p2) {
     return Double.compare(p2.getPrice(), p1.getPrice());
 }
}
class NameComparator implements Comparator<Product> {
 public int compare(Product p1, Product p2) {
     return p1.getName().compareToIgnoreCase(p2.getName());
 }
}
public class MultipleSortingStrategies {
 public static void main(String[] args) {
     List<Product> products = new ArrayList<>();
     products.add(new Product("Laptop", 75000));
     products.add(new Product("Smartphone", 25000));
     products.add(new Product("Headphones", 3000));
     products.add(new Product("Smartwatch", 12000));
     System.out.println("Original List:");
     products.forEach(System.out::println);
     Collections.sort(products, new PriceAscendingComparator());
     System.out.println("\nSorted by Price (Ascending):");
     products.forEach(System.out::println);
     Collections.sort(products, new PriceDescendingComparator());
     System.out.println("\nSorted by Price (Descending):");
     products.forEach(System.out::println);
     Collections.sort(products, new NameComparator());
     System.out.println("\nSorted by Name (Alphabetical):");
     products.forEach(System.out::println);
 }
}

