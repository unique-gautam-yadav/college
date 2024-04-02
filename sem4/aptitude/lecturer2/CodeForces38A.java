import java.util.Scanner;

public class CodeForces38A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        n = sc.nextInt();

        int arr[] = new int[100];

        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        int years = 0;

        for (int i = a; i < b; i++) {
            years += arr[i - 1];
        }

        System.out.println(years);

        sc.close();
    }
}
