package spring.learning.session7.generic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PolymophismExample {
    public static void main(String[] args) {
      // [Polymorphism: Why use List\<List\> new ArrayList\<> instead of ArrayList\<List\> new ArrayList\<>?](https://stackoverflow.com/questions/9852831/polymorphism-why-use-list-list-new-arraylist-instead-of-arraylist-list-n)
        // Create lists with different implementations
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // Add elements to both
        arrayList.add("Toyota");
        linkedList.add("Honda");
        processItems(arrayList);
        processItems(linkedList);
    } // You can write methods that accept any List implementation

    public static void processItems(List<String> items) {
        // Works with either ArrayList or LinkedList
        for (String item : items) {
            System.out.println(item);
        }
    }

    // Call the method with either implementation
}
