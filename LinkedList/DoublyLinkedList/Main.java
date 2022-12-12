package LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertFirst(23);
        ll.insertFirst(3);
        ll.insertFirst(30);
        ll.display();
        System.out.println();
        ll.insertLast(100);
        ll.display();
        System.out.println();
        ll.insertAtIndex(2, 2);
        ll.display();
    }
}
