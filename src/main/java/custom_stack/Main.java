package custom_stack;
//Implement custom Stack structure

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack(4);
        stack.addInTop(1);
        stack.addInTop(2);
        stack.addInTop(3);
        stack.addInTop(4);

        while (!stack.isEmpty()) {
            Object value = stack.deleteTop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
