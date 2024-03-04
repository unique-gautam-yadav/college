/**
 * Recurssion
 */
public class Recurssion {

    public void print(int n) {
        System.out.print(n + "  ");
        if (n > 0) {
            print(n - 1);
        }
    }

    public void reverseStr(String str) {

        reverseStr(str, str.length() - 1);
        System.out.println();
    }

    private void reverseStr(String str, int index) {
        System.out.print(str.charAt(index));

        if (index > 0) {
            reverseStr(str, index - 1);
        }
    }

    public String reverse(String str) {

        //

        return "";
    }

    public int fact(int n) {
        if (n == 0) {
            return 1;
        }

        return n * fact(n - 1);
    }

    public int sumOfDigits(int num) {

        if (num < 10) {
            System.out.println(num);
            return num;

        }

        System.out.println(num);
        return (num % 10) * 10 + sumOfDigits(num / 10);
    }

    public int maxOfArray(int[] numbers) {
        return max(numbers, 0);
    }

    private int max(int[] arr, int i) {
        if (i == arr.length - 1) {
            return arr[i];
        }

        int m = max(arr, i + 1);
        if (m > arr[i]) {
            return m;
        }
        return arr[i];

    }

    public void reverseArray(int[] arr) {
        _revArr(arr, 0);
        System.out.println();
    }

    private void _revArr(int[] arr, int i) {
        // if (i == arr.length - 1) {
        // System.out.print(arr[i] + " ");
        // return;
        // }

        // _revArr(arr, i + 1);
        // System.out.print(arr[i] + " ");

        if (i != arr.length - 1) {
            _revArr(arr, i + 1);
        }
        System.out.print(arr[i] + "  ");
    }

    public double pow(double base, int exp) {

        if (exp < 0) {
            return (1. / base) * pow(base, exp + 1);
        }

        if (exp == 0)
            return 1;

        if (exp != 1)
            return base * pow(base, exp - 1);
        return base;
    }

    public double pow2(int base, int exp) {
        if (exp < 0) {
            return 1 / _pow2(base, (exp * -1));
        } else {
            return _pow2(base, exp);
        }
    }

    private double _pow2(int base, int exp) {
        if (exp == 0)
            return 1;

        if (exp == 1)
            return base;
        return base * pow2(base, exp - 1);
    }

    public int gdc2(int n, int m) {
        // if (n < m) {
        // return m - n;
        // } else {
        // return m - n;
        // }

        // int gcd = 1;

        // for (int i = 1; i <= n && i <= m; ++i) {
        // if (n % i == 0 && m % i == 0) {
        // gcd = i;
        // }
        // }

        // return gcd;

        return 0;
    }

    public int gdc(int n, int m) {
        // if (n < m) {
        // return m - n;
        // } else {
        // return m - n;
        // }

        // private static int findGCD(int a, int b) {
        if (m == 0) {
            return n;
        } else {
            return gdc(m, n % m);
        }
        // }

        // int gcd = 1;

        // for (int i = 1; i <= n && i <= m; ++i) {
        // if (n % i == 0 && m % i == 0) {
        // gcd = i;
        // }
        // }

        // return gcd;

        // return 0;
    }
}