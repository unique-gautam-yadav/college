import java.util.Scanner;

public class Problem233A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (n % 2 == 1) {
            System.out.println(-1);
        } else {
            for (int j = n; j > 0; j--)
                System.out.print(j + " ");
        }

        in.close();
    }
}
