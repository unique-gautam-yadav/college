import java.util.Scanner;

public class CodeForces9A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int max = n1 > n2 ? n1 : n2;

        int chances = 7 - max;

        int divisor = gcd(chances, 6);

        System.out.println(chances / divisor + "/" + 6 / divisor);
        sc.close();

    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
