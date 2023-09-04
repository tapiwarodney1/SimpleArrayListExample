import java.util.ArrayList;

public class SimpleArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Accessing elements in the ArrayList
        System.out.println("First fruit: " + fruits.get(0)); // Prints "Apple"

        // Modifying an element
        fruits.set(1, "Grapes"); // Replaces "Banana" with "Grapes"

        // Iterating through the ArrayList
        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Checking if an element exists
        boolean containsApple = fruits.contains("Apple");
        System.out.println("Contains Apple: " + containsApple); // Prints "true"

        // Removing an element
        fruits.remove("Orange");

        // Checking the size of the ArrayList
        int size = fruits.size();
        System.out.println("Number of fruits: " + size); // Prints "2"
    }
}
