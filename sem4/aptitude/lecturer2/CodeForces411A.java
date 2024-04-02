import java.util.Scanner;

public class CodeForces411A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {

            String str = in.nextLine().trim();

            if (check(str)) {
                System.out.println("Correct");
            } else {
                System.out.println("Too weak");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
        in.close();
    }

    public static boolean check(String value) {

        if (value.length() < 5) {
            return false;
        }

        boolean hasCap = false;
        boolean hasSmall = false;
        boolean hasNum = false;
        boolean hasSpecial = false;

        for (int i = 0; i < value.length(); i++) {

            Character c = value.charAt(i);
            if (c >= 'a' && c <= 'z') {
                hasSmall = true;
            }

            else if (c >= 'A' && c <= 'Z') {
                hasCap = true;
            } else if (c >= '0' && c <= '9') {
                hasNum = true;
            } else {
                hasSpecial = true;
            }

        }

        return hasCap && hasSmall && hasNum && hasSpecial;
    }
}
