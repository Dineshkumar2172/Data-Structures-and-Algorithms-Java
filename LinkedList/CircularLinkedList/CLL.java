package LinkedList.CircularLinkedList;

public class CLL {
    public Node head;
    public Node tail;
    public CLL(){
        this.head = null;
        this.tail = null;
    }

    public void insert(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int value){
        Node node = head;
        if(node == null){
            return;
        }

        if(node.value == value){
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if(n.value == value){
                node.next = n.next;
            }
            node = node.next;
        } while (node != head);
    }

    public void display(){
        Node node = head;
        if (head != null){
            do {
                System.out.print(node.value + " -> ");
                node = node.next;
            }while(node != head);
        }
        System.out.println("END");
    }


}
