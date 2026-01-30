package br.com.samiac.problems.hackerrank;

import java.util.List;

public class JumpingOnTheClouds {

	// time = o(n)
	public static int jumpingOnClouds(List<Integer> c) {

		int jumps = 0;

		for (int index = 0; index < c.size(); index++) {

			if (index < c.size() - 2) {

				if (c.get(index + 2) != 1) {
					jumps++;
					index++;
					continue;
				}

			}

			if (index < c.size() - 1) {
				if (c.get(index + 1) != 1) {
					jumps++;
				}
			}

		}

		return jumps;
	}
}
