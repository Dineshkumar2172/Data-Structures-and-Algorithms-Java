package Trees.BinaryTree.UsingArrays;

public class ArrayBinaryTree {
    String[] arr;
    int lastUsedIndex;

    // creating binary tree
    public ArrayBinaryTree(int size){
        arr = new String[size+1];
        this.lastUsedIndex = 0;
        System.out.println("Binary tree of "+size+" is created successfully");
    }

    boolean isFull(){
        if(arr.length == lastUsedIndex+1){
            return true;
        } else {
            return false;
        }
    }

    public void insertIntoBinaryTree(String value){
        if(!isFull()){ 
            arr[lastUsedIndex+1] = value;
            lastUsedIndex++;
            System.out.println("The value " + value + " has been inserted");
        } else {
            System.out.println("The BT is full");
        }
    }

    public void preOrderTraversal(int index){
        if(index > lastUsedIndex){
            return;
        }
        System.out.print(arr[index] + " ");
        preOrderTraversal(index * 2);
        preOrderTraversal(index * 2 + 1);
    }

    public void inOrderTraversal(int index){
        if(index > lastUsedIndex){
            return;
        }
        inOrderTraversal(index * 2);
        System.out.print(arr[index] + " ");
        inOrderTraversal(index * 2 + 1);
    }

    public void postOrderTraversal(int index){
        if(index > lastUsedIndex){
            return;
        }
        postOrderTraversal(index * 2);
        postOrderTraversal(index * 2 + 1);
        System.out.print(arr[index] + " ");
    }

    public void levelOrderTraversal(){
        for(int i = 1; i <= lastUsedIndex; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void search(String value){
        for(int i = 1; i <= lastUsedIndex; i++){
            if(arr[i].equals(value)){
                System.out.println("The value " + value + " is found at " + i);
                return;
            }
        }
        System.out.println("The value " + value + " doesn't exist");
    }

    public void deleteNode(String value){
        for(int i = 1; i <= lastUsedIndex; i++){
            if(arr[i].equals(value)){
                arr[i] = arr[lastUsedIndex];
                lastUsedIndex--;
                System.out.println("The node successfully deleted");
                return;
            }
        }

        System.out.println("The node is node present in the tree");
    }

    public void deleteBinaryTree(){
        arr = null;
        System.out.println("BT deleted successfully");
    }

}
