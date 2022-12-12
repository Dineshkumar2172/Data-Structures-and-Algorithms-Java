package Trees.BinaryTree.UsingArrays;

public class Main {
    public static void main(String[] args) {
        ArrayBinaryTree bT = new ArrayBinaryTree(9);
        bT.insertIntoBinaryTree("N1");
        bT.insertIntoBinaryTree("N2");
        bT.insertIntoBinaryTree("N3");
        bT.insertIntoBinaryTree("N4");
        bT.insertIntoBinaryTree("N5");
        bT.insertIntoBinaryTree("N6");
        bT.insertIntoBinaryTree("N7");
        bT.insertIntoBinaryTree("N8");
        bT.insertIntoBinaryTree("N9");
        bT.preOrderTraversal(1);
        System.out.println();
        bT.inOrderTraversal(1);
        System.out.println();
        bT.postOrderTraversal(1);
        System.out.println();
        bT.levelOrderTraversal();
        System.out.println();
        bT.search("N5");
        bT.search("N10");
        bT.levelOrderTraversal();
        System.out.println();
        bT.deleteNode("N5");
        bT.levelOrderTraversal();
        System.out.println();
        bT.deleteBinaryTree();
    }
}
