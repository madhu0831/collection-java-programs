package collection.com;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Display the elements in the ArrayList
        System.out.println("Fruits in the ArrayList: " + fruits);

        // Accessing elements by index
        System.out.println("Element at index 1: " + fruits.get(1));

        // Checking if an element is present
        System.out.println("Contains 'Banana': " + fruits.contains("Banana"));

        // Removing an element
        fruits.remove("Banana");
        System.out.println("After removing 'Banana': " + fruits);

        // Size of the ArrayList
        System.out.println("Size of the ArrayList: " + fruits.size());

        // Iterating through the ArrayList
        System.out.println("Iterating through the ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

