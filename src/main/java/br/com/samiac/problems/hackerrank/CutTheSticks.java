package br.com.samiac.problems.hackerrank;

import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class CutTheSticks {

    public static List<Integer> cutTheSticks(List<Integer> arr) {

        Stack<Integer> s = new Stack<>();

        arr.sort(Comparator.naturalOrder());

        int min = arr.get(0);

        int count = 0;

        for (int i = 0; i < arr.size(); i++) {

            int v = arr.get(i);

            if (v != 0) {

                if(min == 0){
                    min = v;
                }

                arr.set(i, v - min);

                count++;
            }

            if (i == arr.size() - 1 && v != 0) {
                s.push(count);
                count = 0;
                i = 0;
                min = 0;
            }

        }

        return s;
    }

}
