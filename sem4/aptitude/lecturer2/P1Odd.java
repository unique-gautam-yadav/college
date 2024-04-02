import java.util.Scanner;

public class P1Odd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int n = in.nextInt();

            if (n % 2 == 0) {
                System.out.println(n + " is Even");
            } else {
                System.out.println(n + " is Odd");
            }
        } catch (Exception e) {
            System.out.println("Invalid Number");
        }

        in.close();
    }
}