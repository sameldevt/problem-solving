package br.com.samiac.problems.leetcode;

public class ReverseInteger {

    public static int reverse(int x) {
        String xS = String.valueOf(x);
        StringBuffer sb = new StringBuffer();

        if (x < 0) {
            sb.append("-");
        }

        for (int index = xS.length() - 1; index >= 0; index--) {
            if (xS.charAt(index) != '-') {
                sb.append(xS.charAt(index));
            }
        }

        long t = Long.parseLong(sb.toString());

        if (t > Integer.MAX_VALUE || t < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) t;
    }
}
