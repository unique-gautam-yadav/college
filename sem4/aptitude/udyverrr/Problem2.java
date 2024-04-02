import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {

        revString();

    }

    static void revInt() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n > 0) {
            System.out.print(n % 10);
            n = n / 10;
        }

        sc.close();
    }

    static void revString() {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i = str.length() - 1; i >= 0; i--) {

            System.out.print(str.charAt(i));

        }
        System.out.println();
        sc.close();
    }

}
