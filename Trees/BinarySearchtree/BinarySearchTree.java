package Trees.BinarySearchtree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    BSTNode root;
    public BinarySearchTree(){
        root = null;
        System.out.println("Binary search tree successfully created!");
    }

    public BSTNode insertNode(BSTNode currentNode, int value){
        if(currentNode == null){
            currentNode = new BSTNode(value);
            System.out.println("The value successfully inserted");
            return currentNode;
        } else if(value <= currentNode.data){
            currentNode.left = insertNode(currentNode.left, value);
        } else {
            currentNode.right = insertNode(currentNode.right, value);
        }
        return currentNode;
    }
 
    void insertNode(int value){
        root = insertNode(root, value);
    }

    public void preOrderTraversal(BSTNode node){ 
        if(node == null){
            return;
        }
        System.out.print(node.data + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void inOrderTraversal(BSTNode node){ 
        if(node == null){
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
    }

    public void postOrderTraversal(BSTNode node){ 
        if(node == null){
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data + " ");
    }

    public void levelOrderTraversal(BSTNode node){
        Queue<BSTNode> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            BSTNode presentNode = queue.remove();
            System.out.print(presentNode.data + " ");
            if(presentNode.left != null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
    }

    public void search(BSTNode node, int value){
        if(node == null){
            System.out.println("Tree doesn't exist");
            return;
        }
        if(node.data == value){
            System.out.println("Value " + value + " is found successfully");
            return;
        }
        if(value < node.data){
            search(node.left, value);
            return;
        } 
        if(value > node.data){
            search(node.right, value);
            return;
        }
        System.out.println("values doesn't exist");
        return;
    }

    public static BSTNode minimumNode(BSTNode root){
        if(root.left == null){
            return root;
        } else {
            return minimumNode(root.left);
        }
    }

    public BSTNode deleteNode(BSTNode root, int value){
        if(root == null){
            System.out.println("Value not found in BST");
            return null;
        }
        if(value < root.data){
            root.left = deleteNode(root.left, value);
        } else if(value > root.data) {
            root.right = deleteNode(root.right, value);
        } else {
            if(root.left != null && root.right != null){
                BSTNode temp = root;
                BSTNode minNodeForRight = minimumNode(temp.right);
                root.data = minNodeForRight.data;
                root.right = deleteNode(root.right, minNodeForRight.data);
            } else if(root.left != null) {
                root = root.left;
            } else if(root.right != null){
                root = root.right;
            } else {
                root = null;
            }
        }
        return root;
    }

    public void deleteBSTTree(){
        root = null;
        System.out.println("BST deleted successfully");
    }
}
 