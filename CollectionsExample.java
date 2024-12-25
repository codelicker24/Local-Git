import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        // Array
        int[] numbers = {1, 2, 3, 4, 5};
        
        // ArrayList
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        // HashSet
        Set<Integer> uniqueNumbers = new HashSet<>();
        uniqueNumbers.add(1);
        uniqueNumbers.add(2);
        uniqueNumbers.add(1); // Duplicate won't be added
        
        // HashMap
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        
        // Printing
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("ArrayList: " + names);
        System.out.println("HashSet: " + uniqueNumbers);
        System.out.println("HashMap: " + ages);
    }
}
