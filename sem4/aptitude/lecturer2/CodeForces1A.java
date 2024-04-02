import java.util.Scanner;

public class CodeForces1A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            int n = in.nextInt();
            int m = in.nextInt();
            int a = in.nextInt();

            long f = (long) Math.ceil((double) n / a) * (long) Math.ceil((double) m / a);

            System.out.println(f);
        } catch (Exception e) {
            System.out.println("Invalid input");
        }

        in.close();
    }
}
