package LinkedList.SinglyLinkedList;


public class LinkedList {
    public Node head;
    public Node tail;
    public int size = 0;

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }

        if(index == size){
            insertLast(value);
            return;
        }

        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    public void insertRecursion(int val, int index){
        head = insertRecursion(val, index, head);
    }

    public Node insertRecursion(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRecursion(val, index-1, node.next);
        return node;
    }

    public void deleteFirst(){
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
    }
 
    public void deleteLast(){
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next =  null;
        size--;
    }

    public int findIndexElement(int index){
        Node temp = head;
        if(index > size){
            return 0;
        }

        for(int i = 1; i < size; i++){
            if(i == index){
                return temp.value;
            }
            temp = temp.next;
        }
        return 0;
    }

    public void reverse(){
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

}
