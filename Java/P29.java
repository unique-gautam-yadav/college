import java.util.Scanner;

public class P29 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] arr = str.split(" ");
        String high = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (high.length() > arr[i].length()) {
                high = arr[i];
            }
        }
        System.out.println(high);
        in.close();
    }
}