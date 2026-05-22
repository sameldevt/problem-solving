package br.com.samiac.problems.leetcode;

public class ZigzagConversion {

    /*

        PAYPALISHIRING

        P   A   H   N
        A P L S I I G
        Y   I   R

        PAHNAPLSIIGYIR
     */
    public static String convert(String s, int numRows) {

        if(s.isEmpty()){
            return s;
        }

        StringBuilder sb = new StringBuilder();

        char[][] grid = new char[numRows][s.length()];
        int row = 0;
        int col = 0;

        boolean up = false;

        for (int index = 0; index < s.length(); index++) {

            char c = s.charAt(index);

            grid[row][col] = c;

            if (row == numRows - 1) {
                up = true;
            }

            if (up) {
                col++;
                row--;

                if (row <= 0) {
                    up = false;
                    row = 0;
                }
            } else {
                row++;
            }
        }

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                char ch = grid[r][c];

                if(ch != '\u0000'){
                    sb.append(ch);
                }
            }
        }

        return sb.toString();
    }
}
