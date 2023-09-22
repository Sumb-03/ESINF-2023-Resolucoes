public class Exercicio1 {
    public static String recursiveReverseString(String word) {

        if (word == null || word.isEmpty()) {
            return "";
        }

        Character c = word.charAt(0);
        String result = recursiveReverseString(word.substring(1)) + c;
        return result;
    }

    public static int recursiveProductOfTwoNumbers(int m, int n) {
        if (n == 0 || m == 0) {
            return 0;
        }

        int result = m + recursiveProductOfTwoNumbers(m, n - 1);
        return result;
    }

    public static int recursiveGreatestCommonDivisor(int m, int n) {
        if (n == 0) {
            return m;
        }
        int result = recursiveGreatestCommonDivisor(n, m % n);
        return result;
    }

    public static int recursiveConvertStringOfDigits(String s) {
        if (s.length() == 1) {
            return (int) s.charAt(0) - '0';
        }

        int result = s.charAt(0) - '0';
        result = result * (int) Math.pow(10, s.length() - 1) + recursiveConvertStringOfDigits(s.substring(1));

        return result;
    }

    public static boolean recursiveIsPalindrome(int n) {
        if (n < 0) {
            return false;
        }

        return isPalindromeHelper(n, n, 0);
    }

    private static boolean isPalindromeHelper(int original, int current, int reversed) {
        if (current == 0) {
            return original == reversed;
        }

        int lastDigit = current % 10;
        reversed = reversed * 10 + lastDigit;

        return isPalindromeHelper(original, current / 10, reversed);
    }

    public static int recursiveSumArrayElements(int[][] array) {
        return recursiveSum(array, 0, 0, 0);
    }

    private static int recursiveSum(int a[][], int i, int j, int sum) {
        if (i == a.length - 1 && j == a[0].length - 1) {
            return a[i][j] + sum;
        }

        if (j + 1 == a[0].length) {
            return recursiveSum(a, i + 1, 0, sum + a[i][j]);
        } else {
            return recursiveSum(a, i, j + 1, sum + a[i][j]);
        }

    }
}
