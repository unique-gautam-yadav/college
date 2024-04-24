import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        String str = new String("Gautam");
        String str2 = "Gautam";

        System.out.println(str.equals(str2));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int num = sc.nextInt();
        int index = -1;

        for (int j = 0; j < arr.length; j++) {
            if (num == arr[j]) {
                index = j;
                break;
            }
        }

        System.out.println(index);

        sc.close();

    }
}
