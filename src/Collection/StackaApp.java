package Collection;

import java.util.Stack;

public class StackaApp {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Saiful");
        stack.push("Amin");
        stack.push("Rizki");

        for (var value = stack.pop(); value != null; value = stack.pop()){
            System.out.println(value);
        }
    }
}
