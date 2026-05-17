package br.com.samiac.problems.leetcode;

public class NumberOf1Bits {

    public static int hammingWeight(int n) {

        int c = 0;

        while (n > 0) {
            if (n % 2 == 1) {
                c++;
            }
            n = n / 2;
        }

        return c;
    }
}
