package LinkedLists.doubleList;

public class DoublyLinkedList {
    private DNode head;

    // Insert at head
    /* function insertAtHead(value):
    newNode = createNode(value)
    if head is NUll:
        head = newNode
        return 
    newNode.next = head
    head.prev = newNode
    head = newNode 
    */

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
/* function insertAtTail(value):
    newNode = createNode(value)
    if head is NULL:
        head = newNode
        return
    temp = head
    while temp.next is not NULL:
        temp = temp.next
    temp.next = newNode
    newNode.prev = temp
*/
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
    /*
     * 1) if the list is null
     * 2) if the target is the head node
     * 3) if the list is not empty
     */

/* function deleteNode(value):
 if head is NULL:
    return 
if head.data = value:
    head = head.next
    if head is not NULL:
        head.prev = NUll
    return
temp = head
while temp is not NULL and temp.data != value:
    temp = temp.next
if temp is not NULL:
    temp.prev.next = temp.next // prev skips deleted node and moves with the other
    if temp.next is not NULL:// prevent nunable or inaccesible data
        temp.next.prev = temp.prev // linked between the prev node of the deleted node to the next node of the deleted node
 */

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


}







