package LinkedList.CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CLL cll = new CLL();
        cll.insert(21);
        cll.insert(22);
        cll.insert(23);
        cll.insert(24);
        cll.display();
        System.out.println();
        cll.delete(22);
        cll.display();
    }
}
