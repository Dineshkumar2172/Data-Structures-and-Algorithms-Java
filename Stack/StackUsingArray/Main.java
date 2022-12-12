public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        System.out.println(stack.isFull());
        stack.push(21);
        stack.push(22);
        stack.push(23);
        stack.push(24);
        stack.push(25);
        stack.push(26);
    }
}