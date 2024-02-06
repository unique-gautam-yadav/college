import java.util.Scanner;

public class Isit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str1 = in.next();
        String str2 = in.next();

        boolean e = str1.equals(str2);

        System.out.println(e);

        in.close();
    }
}
