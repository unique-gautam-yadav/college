import java.util.ArrayList;
import java.util.Collections;

public class Test2 {
    public static void main(String[] args) {

        String str = "candidates = [2, 3, 6, 7], target = 7";

        ArrayList<Integer> lst = getCandidates(str);

        int target = getTarget(str);

        System.out.println(getOutput(target, lst));

    }

    static ArrayList<Integer> getOutput(int target, ArrayList<Integer> c) {

        ArrayList<Integer> array = new ArrayList<Integer>();

        int sum = target;
        boolean flag = false;

        for (int i = 0; i < c.size(); i++) {

            array.add(c.get(i));
            sum -= c.get(i);
            if (sum == 0) {
                break;
            }

            if (sum < 0) {
                flag = true;
                break;
            }

        }

        return flag ? new ArrayList<Integer>() : array;
    }

    static int getTarget(String str) {

        String[] p = str.split("target = ");

        return Integer.parseInt(p[1]);
    }

    static ArrayList<Integer> getCandidates(String str) {
        ArrayList<Integer> values = new ArrayList<Integer>();
        String[] parts = str.split("candidates = ");

        parts = parts[1].split(", target");

        parts = parts[0].substring(1, parts[0].length() - 1).split(",");

        for (int i = 0; i < parts.length; i++) {
            try {
                values.add(Integer.parseInt(parts[i]));
            } catch (Exception e) {
                continue;
            }
        }

        Collections.sort(values);

        return values;

    }
}
