import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio1Test {

    @org.junit.jupiter.api.Test
    void recursiveReverseString() {
        String s = "";
        String result = Exercicio1.recursiveReverseString(s);
        String expectedRsult = "";
        assertEquals(result, expectedRsult);
    }
    void recursiveReverseString1() {
        String s = "A";
        String result = Exercicio1.recursiveReverseString(s);
        String expectedRsult = "A";
        assertEquals(result, expectedRsult);
    }
    void recursiveReverseString2() {
        String s = "ABCDE";
        String result = Exercicio1.recursiveReverseString(s);
        String expectedRsult = "EDCBA";
        assertEquals(result, expectedRsult);
    }

    @org.junit.jupiter.api.Test
    void recursiveReverseString3() {
        String s = null;
        String result = Exercicio1.recursiveReverseString(s);
        String expectedRsult = "";
        assertEquals(result, expectedRsult);
    }

    @Test
    void recursiveProductOfTwoNumbers() {
        int m = 10;
        int n = 5;
        int result = Exercicio1.recursiveProductOfTwoNumbers(m,n);
        int expectedResult = 50;
        assertEquals(result,expectedResult);
    }
    void recursiveProductOfTwoNumbers2() {
        int m = 10;
        int n = 0;
        int result = Exercicio1.recursiveProductOfTwoNumbers(m,n);
        int expectedResult = 0;
        assertEquals(result,expectedResult);
    }

    void recursiveProductOfTwoNumbers3() {
        int m = 0;
        int n = 0;
        int result = Exercicio1.recursiveProductOfTwoNumbers(m,n);
        int expectedResult = 0;
        assertEquals(result,expectedResult);
    }

    @Test
    void recursiveGreatestCommonDivisor() {
        int m = 0;
        int n = 0;
        int result = Exercicio1.recursiveGreatestCommonDivisor(m,n);
        int expectedResult = 0;
        assertEquals(result,expectedResult);
    }
    @Test
    void recursiveGreatestCommonDivisor2() {
        int m = 10;
        int n = 0;
        int result = Exercicio1.recursiveGreatestCommonDivisor(m,n);
        int expectedResult = 10;
        assertEquals(result,expectedResult);
    }

    @Test
    void recursiveGreatestCommonDivisor3() {
        int m = 48;
        int n = 30;
        int result = Exercicio1.recursiveGreatestCommonDivisor(m,n);
        int expectedResult = 6;
        assertEquals(result,expectedResult);
    }

    @Test
    void recursiveConvertStringOfDigits() {
        String s = "1";
        int result = Exercicio1.recursiveConvertStringOfDigits(s);
        int expectedResult = 1;
        assertEquals(expectedResult, result);
    }

    @Test
    void recursiveConvertStringOfDigits2() {
        String s = "13531";
        int result = Exercicio1.recursiveConvertStringOfDigits(s);
        int expectedResult = 13531;
        assertEquals(expectedResult, result);
    }

    @Test
    void recursiveIsPalindrome() {
        int n = 99;
        boolean result = Exercicio1.recursiveIsPalindrome(n);
        boolean expectedResult = true;
        assertEquals(expectedResult, result);
    }

    @Test
    void recursiveIsPalindrome2() {
        int n = 101;
        boolean result = Exercicio1.recursiveIsPalindrome(n);
        boolean expectedResult = true;
        assertEquals(expectedResult, result);
    }

    @Test
    void recursiveIsPalindrome3() {
        int n = 10;
        boolean result = Exercicio1.recursiveIsPalindrome(n);
        assertFalse(result);
    }

    @Test
    void recursiveSumArrayElements() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int n = 3;
        int result = Exercicio1.recursiveSumArrayElements(arr);
        int expectedResult = 45;

        assertEquals(expectedResult, result);
    }

    @Test
    void recursiveSumArrayElements2() {
        int[][] arr = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        int n = 3;
        int result = Exercicio1.recursiveSumArrayElements(arr);
        int expectedResult = 9;

        assertEquals(expectedResult, result);
    }
}