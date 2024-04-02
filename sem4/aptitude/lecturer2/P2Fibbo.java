import java.util.Scanner;

public class P2Fibbo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = 0;
        int b = 1;
        try {
            int n = in.nextInt();
            if (n > 10) {
                System.out.println("Out of range number");
            } else {
                for (int i = 0; i < n; i++) {
                    System.out.print(a + "  ");
                    int c = a + b;
                    a = b;
                    b = c;
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Invalid number");
        }

        in.close();

    }
}
