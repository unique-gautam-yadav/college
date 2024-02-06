import java.util.Scanner;

public class StringProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        String res = "";

        for (int i = 0; i < input.length(); i++) {
            char cg = input.charAt(i);
            if (!res.contains(cg + "")) {
                res = res + cg;
            }
        }

        System.out.println(res);

        in.close();
    }
}
