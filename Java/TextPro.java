import java.util.Scanner;

public class TextPro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int index = 0;

        for (int i = num; i > 0; i /= 10) {
            int rem = i % 10;

            if (rem == 0) {
                int iii = (int) Math.pow(10, index);
                num += (int) (iii * 5);
            }
            index++;
        }

        System.out.println(num);
        in.close();
    }
}
