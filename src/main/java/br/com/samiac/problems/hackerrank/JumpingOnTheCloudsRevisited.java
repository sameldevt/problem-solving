package br.com.samiac.problems.hackerrank;

public class JumpingOnTheCloudsRevisited {

	// time = o(n), space = o(1)
	public static int jumpingOnClouds(int[] c, int k) {

		int totalEnergy = 100, index = 0, i;

		do {

			i = (k + index) % c.length;

			totalEnergy -= 1;

			if (c[i] == 1) {
				totalEnergy -= 2;
			}

			index += k;

		} while (i != 0);

		return totalEnergy;
	}
}
