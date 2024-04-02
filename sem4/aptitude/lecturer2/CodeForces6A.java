import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CodeForces6A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> lst = new ArrayList<Integer>();

        for (int i = 0; i < 4; i++) {
            lst.add(in.nextInt());
        }

        Collections.sort(lst);

        if (lst.get(0) + lst.get(1) > lst.get(2) || lst.get(1) + lst.get(2) > lst.get(3)) {
            System.out.println("TRIANGLE");
        } else if (lst.get(0) + lst.get(1) == lst.get(2) || lst.get(1) + lst.get(2) == lst.get(3)) {
            System.out.println("SEGMENT");
        } else {
            System.out.println("IMPOSSIBLE");
        }

        in.close();

    }
}

/*
 * 4 2 1 3
 * 1 2 3 4
 * 1 + 2 == 3
 * 2 + 3 > 4
 * 
 * 
 * 7 2 2 4
 * 2 2 4 7
 * 2 + 2 == 4
 * 2 + 4 > 7
 * 
 */