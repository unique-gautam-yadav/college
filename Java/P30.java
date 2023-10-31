import java.util.Scanner;

public class P30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            int count = 1;
            for (int j = 1; j < num[i]; j++) {
                if (num[i] % j == 0) {
                    count++;
                }
            }
            if (count == 3) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        in.close();
    }
}
