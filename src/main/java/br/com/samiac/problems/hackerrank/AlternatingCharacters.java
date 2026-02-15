package br.com.samiac.problems.hackerrank;

public class AlternatingCharacters {

    public static int alternatingCharacters(String s) {

        char c = s.charAt(0);
        int delCount = 0;

        for (int index = 1; index < s.length(); index++) {

            char c2 = s.charAt(index);

            if (c2 == c) {
                delCount++;
            }

            c = c2;
        }

        return delCount;
    }
}
