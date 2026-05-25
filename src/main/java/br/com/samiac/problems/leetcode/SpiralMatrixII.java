package br.com.samiac.problems.leetcode;

public class SpiralMatrixII {

    public static int[][] generateMatrix(int n) {

        int[][] grid = new int[n][n];

        int r = 0;
        int c = 0;
        int s = 1;

        int d = 1;

        int p = (int) Math.pow(n, 2);

        while (s <= p) {

            grid[r][c] = s;

            s++;

            switch (d) {
                case 1:
                    if (c + 1 < grid[0].length && grid[r][c + 1] == '\u0000') {
                        c = c + 1;
                    } else {
                        d = 2;
                        r++;
                    }
                    break;
                case 2:
                    if (r + 1 < grid.length && grid[r + 1][c] == '\u0000') {
                        r = r + 1;
                    } else {
                        d = 3;
                        c--;
                    }
                    break;
                case 3:
                    if (c - 1 >= 0 && grid[r][c - 1] == '\u0000') {
                        c = c - 1;
                    } else {
                        d = 4;
                        r--;
                    }
                    break;
                case 4:

                    if (r - 1 >= 0 && grid[r - 1][c] == '\u0000') {
                        r = r - 1;
                    } else {
                        d = 1;
                        c++;
                    }
                    break;
            }


        }

        return grid;
    }
}
