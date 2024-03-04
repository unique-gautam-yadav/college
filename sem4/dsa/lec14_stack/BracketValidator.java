

public class BracketValidator {
    public static void main(String[] args) {
        String expr = "{[()]}";

        System.out.println(isValidated(expr));
    }

    static public boolean isValidated(String s) {

        // ArrayList<Character> st = new ArrayList<Character>();
        Character[] st = new Character[s.length()];

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                st[count] = c;
                count++;
                continue;
            }

            if (count == 0) {
                return false;
            }

            if (c == '{') {
                if (c == ']' || c == ')') {
                    return false;
                }
            } else if (c == '[') {
                if (c == '}' || c == ')') {
                    return false;
                }
            } else if (c == '(') {
                if (c == '}' || c == ']') {
                    return false;
                }
            }
        }

        // for (int i = 0, j = count - 1; i < count && j >= 0; i++, j--) {
        //     Character c = st[i];

        //     if (c == '{') {
        //         if (c == ']' || c == ')') {
        //             return false;
        //         }
        //     } else if (c == '[') {
        //         //
        //     }
        // }

        System.out.println(st.toString());

        return false;
    }
}