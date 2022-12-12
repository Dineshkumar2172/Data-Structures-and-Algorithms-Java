package Trees.BinaryTree.UsingLinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListBinaryTree {
    BinaryNode root;

    // creating binary tree
    public LinkedListBinaryTree(){
        this.root = null;
    }

    public void preOrderTraversal(BinaryNode node){
        // input node represents root node
        if(node == null){
            return;
        }
        System.out.print(node.data + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void inOrderTraversal(BinaryNode node){
        if(node == null){
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
    }

    public void postOrderTraversal(BinaryNode node){
        if(node == null){
            return;
        }

        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data + " ");
    }

    public void levelOrderTraversal(){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove(); // returns the element available at the front of the queue and removes that element from the queue.
            System.out.print(presentNode.data + " ");
            if(presentNode.left != null){
                queue.add(presentNode.left);
            }

            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
    }

    public void search(String value){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.data.equals(value)){
                System.out.println("The value : " + value + " is found in tree");
                return;
            }else{
                if(presentNode.left != null){
                    queue.add(presentNode.left);
                }
    
                if(presentNode.right != null){
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("The value : " + value + " is not found in tree");
    }

    public void insert(String value){
        BinaryNode newNode = new BinaryNode();
        newNode.data = value;
        if(root == null){
            root = newNode;
            System.out.println("Inserted new node at root");
        }

        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.left == null){
                presentNode.left = newNode;
                System.out.println("Successfully inserted");
                break ;
            } else if(presentNode.right == null){
                presentNode.right = newNode;
                System.out.println("successfully added");
                break;
            } else {
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }

    public BinaryNode getDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode presentNode = null;
        while(!queue.isEmpty()){
            presentNode = queue.remove();
            if(presentNode.left != null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
        return presentNode;
    }

    void deleteDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode previousNode = null;
        BinaryNode presentNode = null;
        while(!queue.isEmpty()){
            previousNode = presentNode;
            presentNode = queue.remove();
            if(presentNode.left == null){
                previousNode.right = null;
                return;
            } else if (presentNode.right == null){
                presentNode.left = null;
                return;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }
    }
 
    public void deleteNode(String value){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.data.equals(value)){
                presentNode.data = getDeepestNode().data;
                deleteDeepestNode();
                System.out.println("The node is deleted");
                return;
            } else {
                if(presentNode.left != null) queue.add(presentNode.left);
                if(presentNode.right != null) queue.add(presentNode.right);
            }
        }

        System.out.println("The node does not exist in this BT");
    }

    public void deleteBinaryTree(){
        root = null;
        System.out.println("Binary tree successfully deleted");
    }
}
