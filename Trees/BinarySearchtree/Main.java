package Trees.BinarySearchtree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insertNode(70);
        bst.insertNode(50);
        bst.insertNode(90);
        bst.insertNode(30);
        bst.insertNode(60);
        bst.insertNode(80);
        bst.insertNode(100);
        bst.insertNode(20);
        bst.insertNode(40);
        bst.preOrderTraversal(bst.root);
        System.out.println();
        bst.inOrderTraversal(bst.root);
        System.out.println();
        bst.postOrderTraversal(bst.root);
        System.out.println();
        bst.levelOrderTraversal(bst.root);
        System.out.println();
        bst.search(bst.root, 80);
        bst.search(bst.root, 1000);
        bst.deleteNode(bst.root, 90);
        bst.levelOrderTraversal(bst.root);
        System.out.println();
        bst.deleteBSTTree();
    }
}
