package Trees.BinaryTree.UsingLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedListBinaryTree binaryTree = new LinkedListBinaryTree();
        BinaryNode n1 = new BinaryNode();
        n1.data = "N1";
        BinaryNode n2 = new BinaryNode();
        n2.data = "N2";
        BinaryNode n3 = new BinaryNode();
        n3.data = "N3";
        BinaryNode n4 = new BinaryNode();
        n4.data = "N4";
        BinaryNode n5 = new BinaryNode();
        n5.data = "N5";
        BinaryNode n6 = new BinaryNode();
        n6.data = "N6";
        BinaryNode n7 = new BinaryNode();
        n7.data = "N7";
        BinaryNode n8 = new BinaryNode();
        n8.data = "N8";
        BinaryNode n9 = new BinaryNode();
        n9.data = "N9";

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        n4.left = n8;
        n4.right = n9;
        binaryTree.root = n1;
        binaryTree.preOrderTraversal(binaryTree.root);
        System.out.println();
        binaryTree.inOrderTraversal(binaryTree.root);
        System.out.println();
        binaryTree.postOrderTraversal(binaryTree.root);
        System.out.println();
        binaryTree.levelOrderTraversal();
        System.out.println();
        binaryTree.search("N7");
        binaryTree.search("N10");
        binaryTree.insert("N10");
        binaryTree.insert("N11");
        binaryTree.insert("N12");
        binaryTree.insert("N13");
        binaryTree.insert("N14");
        binaryTree.insert("N15");
        binaryTree.insert("N16");
        binaryTree.insert("N17");
        binaryTree.levelOrderTraversal();
        System.out.println();
        binaryTree.deleteDeepestNode();
        binaryTree.levelOrderTraversal();
        System.out.println();
        binaryTree.deleteNode("N5");
        binaryTree.levelOrderTraversal();
        System.out.println();
        binaryTree.deleteBinaryTree();
        System.out.println();
    }
}
 