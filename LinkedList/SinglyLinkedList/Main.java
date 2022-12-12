package LinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertFirst(5);
        ll.insertFirst(6);
        ll.insertFirst(7);
        ll.insertFirst(8);
        ll.insertFirst(9);
        ll.insertLast(20);
        ll.insert(99, 3);
        ll.display();
        System.out.println();
        ll.deleteFirst();
        ll.deleteLast();
        ll.display();
        System.out.println();
        System.out.println(ll.findIndexElement(2));
        ll.reverse();
        ll.display();
        System.out.println();
        ll.insertRecursion(10, 2);
        ll.display();
    }
}