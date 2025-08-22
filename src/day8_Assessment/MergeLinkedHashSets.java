package day8_Assessment;
import java.util.LinkedHashSet;
public class MergeLinkedHashSets {
    public static void main(String[] args) {
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("Date");
        set2.add("Banana");
        set2.add("Elderberry");
        set1.addAll(set2);
        System.out.println("Merged LinkedHashSet: " + set1);
    }
}

