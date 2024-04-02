import java.util.Scanner;

/**
 * CodeForces80A
 */
public class CodeForces80A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n2 == next_prime(n1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }

    static boolean is_prime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int next_prime(int num) {
        int next_num = num + 1;
        while (!is_prime(next_num)) {
            next_num++;
        }
        return next_num;
    }
}
