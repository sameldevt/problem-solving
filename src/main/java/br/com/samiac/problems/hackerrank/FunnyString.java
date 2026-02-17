package br.com.samiac.problems.hackerrank;

public class FunnyString {

    public static String funnyString(String s) {

        boolean isFunny = false;
        
        for (int index = 0; index < s.length(); index++) {

            if (index < s.length() - 1) {
                char c1 = s.charAt(index);
                char c2 = s.charAt(index + 1);

                char c3 = s.charAt(s.length() - 1 - index);
                char c4 = s.charAt(s.length() - 1 - index - 1);

                if (Math.abs(c1 - c2) == Math.abs(c3 - c4)) {
                    isFunny = true;
                    continue;
                }

                isFunny = false;
                break;

            }
        }

        return isFunny ? "Funny" : "Not Funny";
    }

}
