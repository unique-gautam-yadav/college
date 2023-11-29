package java_pro;

public class Statement1 {
    public static void main(String[] args) {
        String input1 = "Rajib";
        String input2 = "Roy";
        int input3 = 560037;
        int input4 = 6;

        StringBuilder res = new StringBuilder();

        String smallerInput;
        String largerInput;

        if (input1.length() < input2.length()) {
            smallerInput = input1;
            largerInput = input2;
        } else {
            smallerInput = input2;
            largerInput = input1;
        }

        ;
        res.append(smallerInput.charAt(smallerInput.length() - 1));
        res.append(largerInput);

        String pinToString = Integer.toString(input3);

        res.append(pinToString.charAt(input4 - 1));

        StringBuilder str = new StringBuilder(pinToString);

        res.append(str.reverse().charAt(input4 - 1));

        StringBuilder str2 = new StringBuilder();

        for (int i = 0; i < res.length(); i++) {
            if (Character.isUpperCase(res.charAt(i))) {
                str2.append(Character.toLowerCase(res.charAt(i)));
            } else {
                str2.append(Character.toUpperCase(res.charAt(i)));
            }
        }

        System.out.println(str2.toString());
    }

    {
        //
    }
}