import java.util.Scanner;

public class P22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n1 = in.nextInt();
        int n2 = in.nextInt();

        for (int i = 1; i <= n1; i++) {
            if (i % n2 != 0) {
                System.out.println(i);
            }
        }

        in.close();

    }
}