import java.util.Collections;
import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        /*
         * Add operation adds elements to the linked list.
         * It maintains insertion order.
         * Time complexity - O(1)
         */
        linkedList.add(10);
        linkedList.add(20);

        /*
         * Adds elements to the linked list by index number.
         * Time complexity - O(n)
         */
        linkedList.add(2,12);
        linkedList.add(3,11);

        /*
         * It returns the size of the linked list.
         * Return type is always integer.
         * Time complexity - O(1)
         */
        int size = linkedList.size();
        System.out.println("\nThe size of the LinkedList is " + size);

        /*
         * Set operation replaces elements to the linked list by specific index number.
         * Time complexity - O(n)
         */
        linkedList.set(2,9);
        printList(linkedList);

        /*
         * Remove operation removes elements of a specific index from the linked list.
         * Time complexity - O(n)
         */
        linkedList.remove(1);
        printList(linkedList);

        /*
         * We can sort any LinkedList using Collections.sort<list>
         * Time complexity - O(n log(n))
         */
        Collections.sort(linkedList);
        printList(linkedList);

        /*
         * Adds element to the first and last position of the linked list.
         * Time complexity - O(1)
         */
        linkedList.addFirst(100);
        linkedList.addLast(200);

        /*
         * Gets the first element of the linked list.
         * Time complexity - O(1)
         */
        System.out.println("\nThe first element is " + linkedList.getFirst());

        /*
         * Removes the first and last element from the linked list.
         * Time complexity - O(1)
         */
        linkedList.removeFirst();
        linkedList.removeLast();

        /*
         * Removes the last element from the linked list.
         * Time complexity - O(1)
         */
        linkedList.removeLast();

        printList(linkedList);

        /*
         * Checks if the linked list contains particular element
         * Time complexity - O(n)
         */
        boolean contains = linkedList.contains(103);
        System.out.println("\n\nThe result of contain is - " + contains);

        /*
         * Clear operation removes all the elements from the linked list.
         * Time complexity - O(n)
         */
        linkedList.clear();
    }

    private static void printList(LinkedList<Integer> linkedList) {
        System.out.println("\n\nPrinting the list");

        for(Integer element : linkedList){
            System.out.println(element);
        }
    }
}
