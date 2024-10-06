import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class CollectionsExample {
    public static void main(String[] args) {
        // Using ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("ArrayList: " + fruits);

        // Using HashSet
        HashSet<String> fruitSet = new HashSet<>(fruits);
        fruitSet.add("Banana"); // Duplicate will not be added
        System.out.println("HashSet: " + fruitSet);

        // Using HashMap
        HashMap<String, Integer> fruitCount = new HashMap<>();
        fruitCount.put("Apple", 5);
        fruitCount.put("Banana", 3);
        System.out.println("HashMap: " + fruitCount);
    }
}
