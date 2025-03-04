package LinkedLists.singleList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert elements
        list.insertAtHead(10);
        list.insertAtHead(5);
        list.insertAtTail(20);
        list.insertAtTail(25);

        // Print list
        System.out.print("Linked List: ");
        list.printList();  // Expected: 5 -> 10 -> 20 -> 25 -> null

        // Search for an element
        System.out.println("Search 10: " + list.search(10));  // Output: true
        System.out.println("Search 30: " + list.search(30));  // Output: false

        // Delete an element
        list.deleteNode(10);
        System.out.print("After deleting 10: ");
        list.printList();  // Expected: 5 -> 20 -> 25 -> null
    }
}
