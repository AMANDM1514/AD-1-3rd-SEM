import java.util.ArrayList;
import java.util.Collections;

public class Java_Collections {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(89);
        list.add(24);
        System.out.println("List: " + list);
        
        // Accessing an element
        int element = list.get(0);
        System.out.println("First element: " + element);
        
        // Adding elements at specific positions
        list.add(1, 34);
        list.add(0, 60);
        System.out.println("List after adding elements: " + list);
        
        // Removing an element
        list.remove(3);
        System.out.println("List after removal: " + list);
        
        // Getting the size of the list
        int size = list.size();
        System.out.println("Size of the list: " + size);
        
        // Iterating over the list
        System.out.println("Elements in the list:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        
        // Sorting the list
        Collections.sort(list);
        System.out.println("List after sorting: " + list);
    }
}
