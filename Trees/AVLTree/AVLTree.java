package Trees.AVLTree;

import java.util.LinkedList;
import java.util.Queue;

public class AVLTree {
    AVLTreeNode root;
    public AVLTree(){
        this.root = null;
    }

    public void preOrderTraversal(AVLTreeNode node){
        if(node == null){
            return;
        }
        System.out.println(node.data);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void inOrderTraversal(AVLTreeNode node){
        if(node == null){
            return;
        }
        inOrderTraversal(node.left);
        System.out.println(node.data);
        inOrderTraversal(node.right);
    }

    public void postOrderTraversal(AVLTreeNode node){
        if(node == null){
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.data);
    }

    public void levelOrderTraversal(){
        Queue<AVLTreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            AVLTreeNode presentNode = queue.remove();
            System.out.println(presentNode.data + " -> ");
            if(presentNode.left != null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
    }

    public AVLTreeNode search(AVLTreeNode node, int value){
        if(node == null){
            System.out.println("value not found in avl tree");
            return null;
        }else if(node.data == value){
            System.out.println("value found in avl tree");
            return node;
        }else{
            if(value > node.data){
                return search(node.right, value);
            }else{
                return search(node.left, value);
            }
        }
    }

    public AVLTreeNode rotateRight(AVLTreeNode disbalancedNode){
        AVLTreeNode newRoot = disbalancedNode.left;
        disbalancedNode.left = disbalancedNode.left.right;
        newRoot.right = disbalancedNode;
        return newRoot;
    }

    public AVLTreeNode rotateLeft(AVLTreeNode disbalancedNode){
        AVLTreeNode newRoot = disbalancedNode.right;
        disbalancedNode.right = disbalancedNode.right.left;
        newRoot.left = disbalancedNode;
        return newRoot;
    }
    
}
