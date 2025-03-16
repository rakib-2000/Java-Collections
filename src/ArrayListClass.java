import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        /*
         * Add(value) operation adds elements to the array list.
         * It maintains insertion order.
         * Time complexity - O(1)
         */
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(15);

        /*
         * Add(index, value) operation adds elements to the array list.
         * Subsequent elements are shifted after the add operation.
         * Time complexity - O(n)
         */
        arrayList.add(2,19);

        /*
         * It returns the size of the array list.
         * Return type is always integer.
         * Time complexity - O(1) cause by default count goes on.
         */
        System.out.println(arrayList.size());;

        /*
         * Set operation replaces elements to the array list by specific index number.
         * Time complexity - O(1)
         */
        arrayList.set(2,12);

        /*
         * Remove operation removes elements of a specific index from the array list.
         * The subsequent elements are shifted after the removal.
         * Time complexity - O(n)
         */
        arrayList.remove(0);

        /*
         * We can sort any ArrayList using Collections.sort<list>
         * Time complexity - O(n log(n))
         */
        Collections.sort(arrayList);

        /*
         * Checks if the array list contains particular element and return a boolean value.
         * Time complexity - O(n)
         */
        System.out.println("\nThe result of contain is " + arrayList.contains(20));

        /*
         * Checks if the array list contains all the mentioned elements
         * Time complexity - O(n)
         */
        boolean containsAll = arrayList.containsAll(List.of(10,12));
        System.out.println("\nThe result of contain is " + containsAll);

        /*
         * Clear operation removes all the elements from the array list.
         * Time complexity - O(n)
         */
        arrayList.clear();

        printList(arrayList);
    }
    private static void printList(ArrayList<Integer> arrayList) {
        System.out.println("\n\nPrinting the list");

        for(Integer element : arrayList){
            System.out.println(element);
        }
    }
}
