package br.com.samiac.problems.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.merge(n, 1, Integer::sum);
        }

        int r = 0;

        for (int k : map.keySet()) {
            if (map.get(k) > nums.length / 2) {
                r = k;
                break;
            }
        }

        return r;
    }
}


