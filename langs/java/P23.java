import java.util.Scanner;

public class P23 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int rounds = in.nextInt();

        for (int i = 0; i < rounds; i++) {
            int n = in.nextInt();
            int even = 0, odd = 0;
            do {
                int r = n % 10;
                if (r % 2 == 0) {
                    even += r;
                } else {
                    odd += r;
                }
                n /= 10;
            } while (n > 0);

            if (even % 4 == 0 || odd % 3 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        in.close();
    }

}
