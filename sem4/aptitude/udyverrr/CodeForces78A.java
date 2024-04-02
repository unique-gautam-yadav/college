import java.util.Scanner;

public class CodeForces78A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine().trim();
        String s2 = sc.nextLine().trim();
        String s3 = sc.nextLine().trim();

        if (countVowels(s1) == 5 && countVowels(s2) == 7 && countVowels(s3) == 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }

    static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }

        return count;
    }
}
