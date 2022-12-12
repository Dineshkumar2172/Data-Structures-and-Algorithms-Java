package LinkedList.DoublyLinkedList;

public class LinkedList {
    public Node head;
    
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int value){
        if(head == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next= node;
        node.prev = temp;
        node.next = null;
    }

    public void insertAtIndex(int value, int index){
        if(head == null || index == 0){
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }

        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        node.next.prev = node;
    }

    public void display(){
        Node node = head;
        Node last = null;
        while(node != null){
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.print("Print in reverse: ");
        while(last != null){
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("END");
    }
}