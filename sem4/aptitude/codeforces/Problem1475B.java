import java.util.Scanner;

public class Problem1475B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int times = in.nextInt();

        while (times-- > 0) {
            int n = in.nextInt();

            if ((n % 2020) <= (n / 2020)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        in.close();
    }
}
