import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String result = removeConsecutiveDuplicates(inputString);
        System.out.println(result);
        sc.close();
    }

    public static String removeConsecutiveDuplicates(String inputString) {
        if (inputString == null || inputString.length() == 0) {
            return inputString;
        }
        StringBuilder result = new StringBuilder();
        char prevChar = inputString.charAt(0);
        result.append(prevChar);
        for (int i = 1; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            if (currentChar != prevChar) {
                result.append(currentChar);
                prevChar = currentChar;
            }
        }
        return result.toString();
    }
}
