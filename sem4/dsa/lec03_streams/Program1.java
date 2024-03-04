import java.util.*;

public class Program1 {
    public static void main(String[] args) {
        int arr[] = { 43, 4, 53, 5, 2 };

        /// Normal way to find max

        // int max = arr[0];
        // double avg = arr[0];
        // for (int i = 1; i < 5; i++) {
        // if (max < arr[i]) {
        // max = arr[i];
        // }
        // avg += arr[i];
        // }

        // avg /= 5;

        /// Using streams API
        int max = Arrays.stream(arr).max().getAsInt();
        double avg = Arrays.stream(arr).average().getAsDouble();

        System.out.println("Max = " + max + "  Average = " + avg);
        
    }
}
