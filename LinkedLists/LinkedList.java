package LinkedLists;

public class LinkedList {
    private Node head;
    
    // Insert at the begining j
    public void insertAtHead(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    // Insert At the end 
    public void insertAtTail(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
            return; 
        }
    }

    // Delete a node by value
    public void deleteNode(int value){
        if (head == null) return;
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // search for value
    public boolean search(int target) {
        Node temp = head;
        while (temp != null) {
            if(temp.data == target){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    // Print the linked list
    public void printList(){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ->  ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
 