import java.util.Scanner;

public class CodeForces38A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int a = sc.nextInt();
        int b = sc.nextInt();

        int y = 0;

        for (int i = a; i < b; i++) {
            y += arr[i - 1];
        }

        System.out.println(y);

        sc.close();
    }
}
