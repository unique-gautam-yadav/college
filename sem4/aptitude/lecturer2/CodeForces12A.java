import java.util.Scanner;
import java.util.Stack;

public class CodeForces12A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        System.out.println(solve(s1 + s2 + s3) ? "YES" : "NO");

        sc.close();
    }

    static public boolean solve(String stg) {
        Stack<Character> st = new Stack<Character>();

        for (Character character : stg.toCharArray()) {
            st.push(character);
        }

        for (Character character : stg.toCharArray()) {
            if (character != st.pop()) {
                return false;
            }
        }

        return true;
    }
}