package LinkedLists.doubleList;

public class DoublyLinkedListDemo {
    public static void main(String[] args){
        DoublyLinkedList dll = new DoublyLinkedList();

        //insert elements
        dll.insertAtHead(10);
        dll.insertAtHead(5);
        dll.insertAtTail(20);
        dll.insertAtTail(25);

        //print list in both directions
        System.out.print("Forward: ");
        dll.printForward();

        System.out.println("Backwards: ");
        dll.printBackwards();

        //search for an element
        System.out.println("Search 10: " + dll.search(10) );
        System.out.println("Search 10: " + dll.search(30) );

        // Delete an element
        dll.deleteNode(10);
        System.out.print(" After deleting 10: ");
        dll.printForward();
    }
}
