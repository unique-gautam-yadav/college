import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        char targetChar = scanner.next().charAt(0);
        int index = searchCharacter(inputString, targetChar);
        System.out.println(index);
        scanner.close();
    }

    public static int searchCharacter(String inputString, char targetChar) {
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == targetChar) {
                return i;
            }
        }
        return -1;
    }
}