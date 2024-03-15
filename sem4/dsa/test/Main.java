import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // System.out.println(isPalindrome("123") ? " Yes " : " No ");
        System.out.println(isPalindromeInt(123) ? " Yes " : " No ");
    }

    static boolean isPalindrome(String str) {

        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            if (st.pop() != str.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    static boolean isPalindromeInt(int val) {

        String str = Integer.toString(val);

        Stack<Character> st = new Stack<Character>();

        int t = val;

        while (t < 0) {
            System.out.println(t % 10);
            t = t % 10;

        }

        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            if (st.pop() != str.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
