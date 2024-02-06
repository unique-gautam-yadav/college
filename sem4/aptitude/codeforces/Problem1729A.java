import java.util.Scanner;

public class Problem1729A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while (t-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            int a1 = a - 1;
            int b1 = Math.abs(b - c) + c - 1;

            if (a1 < b1) {
                System.out.println(1);

            } else if (a1 == b1) {
                System.out.println(3);
            } else {
                System.out.println(2);
            }

        }
        
        in.close();
    }

}