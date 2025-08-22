package day9_Assessments;
import java.util.*;
class Product implements Comparable<Product> {
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
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price); // ascending order
    }
    public String toString() {
        return name + " - ₹" + price;
    }
}
public class ProductSort {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 75000));
        products.add(new Product("Smartphone", 25000));
        products.add(new Product("Headphones", 3000));
        products.add(new Product("Smartwatch", 12000));
        System.out.println("Before sorting:");
        for (Product p : products) {
            System.out.println(p);
        }
        Collections.sort(products);
        System.out.println("\nAfter sorting by price (Ascending):");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
