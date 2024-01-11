import java.util.*;

public class Program1 {
    public static void main(String[] args) {
        int arr[] = { 43, 4, 53, 5, 2 };

        /// Normal way to find max
        // int max = arr[0];
        // for (int i = 1; i < 5; i++) {
        // if (max < arr[i]) {
        // max = arr[i];
        // }
        // }

        /// Using streams API
        int max = Arrays.stream(arr).max().getAsInt();

        System.out.println("Max = " + max);
    }
}
