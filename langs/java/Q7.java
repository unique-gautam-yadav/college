public class Q7 {
        public static void main(String[] args) {
            String input = "abcdE";
            String result = changeCase(input);
            System.out.println(result);
        }
        public static String changeCase(String str) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);
                if (Character.isUpperCase(currentChar)) {
                    sb.append(Character.toLowerCase(currentChar));
                } else if (Character.isLowerCase(currentChar)) {
                    sb.append(Character.toUpperCase(currentChar));
                } else {
                    sb.append(currentChar);
                }
            }
            return sb.toString();
        }
}