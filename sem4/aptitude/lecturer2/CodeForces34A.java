import java.util.Scanner;

public class CodeForces34A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] ele = new int[n];

        for (int i = 0; i < n; i++) {
            ele[i] = in.nextInt();
        }

        int f = 0;
        int s = 0;
        int diff = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int j = i + 1;
            if (i == (n - 1)) {
                j = 0;
            }

            if (Math.abs(ele[j] - ele[i]) < diff) {
                diff = Math.abs(ele[j] - ele[i]);
                f = i + 1;
                s = j + 1;
            }
        }

        System.out.println(f + " " + s);

        in.close();

    }
}
