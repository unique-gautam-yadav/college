import java.util.Stack;

public class Notations {

    int solvePostfix(String str) {
        Stack<Integer> stack = new Stack<Integer>();

        char[] arr = str.toCharArray();
        for (char c : arr) {
            if (c >= '0' && c <= '9') { // Character.isDigit(c);
                stack.push(c - 48);
            } else {
                if (c == '+') {
                    int v1 = stack.pop();
                    int v2 = stack.pop();

                    stack.push(v2 + v1);
                }
                if (c == '-') {
                    int v1 = stack.pop();
                    int v2 = stack.pop();

                    stack.push(v2 - v1);
                }
                if (c == '*') {
                    int v1 = stack.pop();
                    int v2 = stack.pop();

                    stack.push(v2 * v1);
                }
                if (c == '/') {
                    int v1 = stack.pop();
                    int v2 = stack.pop();

                    stack.push(v2 / v1);
                }
            }
        }

        return stack.pop();
    }

    int solvePrefix(String str) {
        Stack<Integer> stack = new Stack<Integer>();
        char[] arr = str.toCharArray();

        for (int i = arr.length - 1; i >= 0; i--) {
            char c = arr[i];
            if (c >= '0' && c <= '9') { // Character.isDigit(c);
                stack.push(c - 48);
            } else {
                if (c == '+') {
                    int v2 = stack.pop();
                    int v1 = stack.pop();

                    stack.push(v2 + v1);
                }
                if (c == '-') {
                    int v2 = stack.pop();
                    int v1 = stack.pop();

                    stack.push(v2 - v1);
                }
                if (c == '*') {
                    int v2 = stack.pop();
                    int v1 = stack.pop();

                    stack.push(v2 * v1);
                }
                if (c == '/') {
                    int v2 = stack.pop();
                    int v1 = stack.pop();

                    stack.push(v2 / v1);
                }
            }
        }

        return stack.peek();
    }
}
