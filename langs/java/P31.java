import java.util.*;

public class P31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();
        String[] ss = new String[str.length()];
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                // System.out.println();
                count++;
                System.out.print(str.charAt(i));
                if (ss[count] == null) {
                    ss[count] = str.charAt(i) + "";
                } else {
                    String temp = ss[count];
                    ss[count] = temp + str.charAt(i);
                }
            } else {
                // System.out.print(str.charAt(i));
                if (ss[count] == null) {
                    ss[count] = str.charAt(i) + "";
                } else {
                    String temp = ss[count];
                    ss[count] = temp + str.charAt(i);
                }

                if (i == str.length() - 1) {
                    count++;
                }
            }

        }

        for (int i = 0; i < count; i++) {
            System.out.println(ss[i]);
        }

        in.close();
    }
}
