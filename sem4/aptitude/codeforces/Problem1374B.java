import java.util.Scanner;

public class Problem1374B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int times = in.nextInt();

        while (times-- > 0) {
            int n = in.nextInt();

            int a = 0, b = 0;
            while (n % 2 == 0) {
                a++;
                n /= 2;
            }
            while (n % 3 == 0) {
                b++;
                n /= 3;
            }

            System.out.println(check(n, a, b));
        }

        in.close();
    }

    static int check(int k, int a, int b) {
        if (k > 1 || a > b)
            return -1;
        else
            return 2 * b - a;
    }
}
