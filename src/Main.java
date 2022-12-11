public class Main {
    public static void main(String[] args) {
        // first thing to do is implement th stack using array.

        NewStack stack = new NewStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.pop();
        System.out.println(stack.toStringArray());
        System.out.println(stack.peek());
    }
}