import java.io.File;
import java.util.Scanner;

public class Problem1 {
    static String[] digit = {
            "zero",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
    };

    public static void main(String[] args) {
        Scanner sc = null;
        try {
        sc = new Scanner(new File("./input_01_1.txt"));
        } catch (Exception e) {
        System.out.println("File not found");
        return;

        }
        long res = 0;
        long res2 = 0;

        while (sc.hasNext()) {
        String str = sc.nextLine();
        res += processStringToInt_1(str);
        res2 += processStringToInt_2("two1nine");
        }
        System.out.println(res);
        System.out.println(res2);
        sc.close();
    }

    public static int processStringToInt_1(String arg) {
        int output = 0;

        for (int i = 0; i < arg.length(); i++) {
            byte b = (byte) arg.charAt(i);
            if (b >= 48 && b <= 57) {
                output += (arg.charAt(i) - 48) * 10;
                break;
            }
        }
        for (int i = arg.length() - 1; i >= 0; i--) {
            byte b = (byte) arg.charAt(i);
            if (b >= 48 && b <= 57) {
                output += (arg.charAt(i) - 48);
                break;
            }

        }
        return output;
    }

    public static int processStringToInt_2(String arg) {

        int t1 = 0, t2 = 0;

        for (int i = 0; i < arg.length(); i++) {
            if (Character.isDigit(arg.charAt(i))) {
                t1 = arg.charAt(i) - 48;
                break;
            }
            boolean f = false;
            for (int j = 1; j < 10; j++) {
                if (arg.substring(i, Math.min(i + digit[j].length(), arg.length())).equals(digit[j])) {
                    t1 = j;
                    f = true;
                    break;
                }
            }
            if (f)
                break;
        }

        for (int i = arg.length() - 1; i >= 0; i--) {
            if (Character.isDigit(arg.charAt(i))) {
                t1 = arg.charAt(i) - 48;
                break;
            }
            boolean f = false;
            for (int j = 1; j < 10; j++) {
                if (arg.substring(i, Math.min(i + digit[j].length(), arg.length())).equals(digit[j])) {
                    t2 = j;
                    f = true;
                    break;
                }
            }
            if (f)
                break;
        }

        return t1 * 10 + t2;
    }
}
