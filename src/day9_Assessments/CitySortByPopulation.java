package day9_Assessments;
import java.util.*;
class City {
 private String name;
 private long population;
 public City(String name, long population) {
     this.name = name;
     this.population = population;
 }
 public String getName() {
     return name;
 }
 public long getPopulation() {
     return population;
 }
 public String toString() {
     return name + " - Population: " + population;
 }
}
public class CitySortByPopulation {
 public static void main(String[] args) {
     List<City> cities = new ArrayList<>();
     cities.add(new City("Mumbai", 20411000));
     cities.add(new City("Delhi", 16787941));
     cities.add(new City("Bangalore", 8443675));
     cities.add(new City("Hyderabad", 6809970));
     System.out.println("Before Sorting:");
     cities.forEach(System.out::println);
     cities.sort(Comparator.comparingLong(City::getPopulation));
     System.out.println("\nAfter Sorting by Population (Ascending):");
     cities.forEach(System.out::println);
     cities.sort(Comparator.comparingLong(City::getPopulation).reversed());
     System.out.println("\nAfter Sorting by Population (Descending):");
     cities.forEach(System.out::println);
 }
}
