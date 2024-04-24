import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        Salesman[] men = {
                new Salesman("A", 10),
                new Salesman("F", 50),
                new Salesman("C", 30),
                new Salesman("B", 20),
                new Salesman("D", 40),
                new Salesman("F", 60),
        };

        Salesman target = new Salesman("A", 10);
        // linearSort();

        bubbleSort(men);

        System.out.println(Arrays.toString(men));

        // for (int i = 0; i < sorted.length; i++) {
        // System.out.println(sorted[i]);
        // }
        // System.out.println(binarySearch(men, target));
        System.out.println(binarySearch(men, target, -1, men.length));

    }

    static int linearSearch(Salesman[] arr, Salesman target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i;
            }
        }

        return -1;
    }

    static int binarySearch(Salesman[] arr, Salesman target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid].equals(target)) {
                return mid;
            }

            if (arr[mid].totalSale < target.totalSale) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    static int binarySearch(Salesman[] arr, Salesman target, int start, int end) {

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid].equals(target)) {
                return mid;
            }

            if (arr[mid].totalSale < target.totalSale) {
                binarySearch(arr, target, mid + 1, end);
            } else {
                binarySearch(arr, target, start, mid - 1);
            }
        }

        return -1;
    }

    static int binarySearch() {
        return -1;
    }

    public static Salesman[] bubbleSort(Salesman[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].totalSale > arr[j + 1].totalSale) {
                    isSwapped = true;
                    Salesman temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!isSwapped) {
                break;
            }
        }

        return arr;
    }

    public static void linearSort() {
        int[] arr = { 11, 32, 34, 54, 15, 26 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
