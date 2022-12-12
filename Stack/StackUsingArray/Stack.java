public class Stack {
    int[] arr;
    int topOfStack;
    public Stack(int size){
        this.arr = new int[size];
        topOfStack = -1;
        System.out.println("The stack is created with the size of : " + size);
    }

    public boolean isEmpty(){
        if(topOfStack == -1){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(topOfStack == arr.length-1){
            return true; 
        }
        return false;
    }

    public void push(int value){
        if(!isFull()){
            arr[topOfStack+1] = value;
            topOfStack++;
            System.out.println("there value " + value + " is successfully inserted into stack");
            return;
        }
        System.out.println("The stack is already full!");
    }
}
