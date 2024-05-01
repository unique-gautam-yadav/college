// import java.util.*;

// public class main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String str = sc.nextLine();

//         System.out.println(isValid(str.split("s = ")[1].split("\"")[1]) ? "yes" : "no");

//         sc.close();
//     }

//     public static boolean isValid(String s) {
//         Stack<Character> stack = new Stack<>();
//         for (char c : s.toCharArray()) {
//             if (c == '(' || c == '[' || c == '{') {
//                 stack.push(c);
//             } else {
//                 if (stack.isEmpty())
//                     return false;
//                 char ch = stack.pop();
//                 if (c == ')' && ch != '(' || c == ']' && ch != '[' || c == '}' && ch != '{')
//                     return false;
//             }
//         }
//         return stack.isEmpty();
//     }
// }