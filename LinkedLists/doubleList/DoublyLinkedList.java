package LinkedLists.doubleList;

public class DoublyLinkedList {
    private DNode head;

    // Insert at head

    public void insertAtHead(int value){
        DNode newNode = new DNode(value);
        if (head == null) {
            head = newNode;
            return;            
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

// Insert at the Tail
public void insertAtTail(int value){
    DNode newNode = new DNode(value);
    if (head == null) {
        head = newNode;
        return;
    }
    DNode temp = head;
    while (temp.next != null) {
        temp = temp.next;
    }
    temp.next = newNode;
    newNode.prev = temp;
}

//Delete a node by value
public void deleteNode(int value){

    if (head == null) return;
    if (head.data == value){
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
    }
    DNode temp = head;
    while (temp != null && temp.data != value) {
        temp = temp.next;
    }
    if (temp != null) {
        temp.prev.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
    }
}
//search method
public boolean search(int value) {
    DNode temp = head;
    while (temp != null) {
        if (temp.data == value) {
            return true;
        }
    }
    return false;
}

//print list in forward direction
public void printForward(){
    DNode temp = head;
    while (temp != null) {
        System.out.print(temp.data+ " <-> ");
        temp = temp.next;
    }
    System.out.println("null");
}

//print list in backward direction

/*
 * //print List in Backwards
function printBackwards():
    temp = head
    while temp.next is not NUll:
        temp = next
    while temp is not NULL:
        print temp.data
        temp = temp.prev 
 */

 public void printBackwards(){
   if (head == null) return;

   DNode temp = head;
   while (temp.next != null) {
    temp = temp.next;
   }
   while (temp != null) {
    System.out.print(temp.data + " <-> ");
    temp = temp.prev;
   }
   System.out.print("null");
 }
}





