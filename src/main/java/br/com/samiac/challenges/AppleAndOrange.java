package br.com.samiac.challenges;

import java.util.List;

public class AppleAndOrange {

	/*
		s: integer, starting point of Sam's house location.
		t: integer, ending location of Sam's house location.
		a: integer, location of the Apple tree.
		b: integer, location of the Orange tree.
		apples: integer array, distances at which each apple falls from the tree.
		oranges: integer array, distances at which each orange falls from the tree.
	*/
	public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
		int appleCount = 0;
		int orangeCount = 0;

		for (int index = 0; index < apples.size(); index++) {
			int apple = apples.get(index);
			if ((a + apple >= s) && (a + apple <= t)) {
				appleCount++;
			}
		}

		for (int index = 0; index < oranges.size(); index++) {
			int orange = oranges.get(index);
			if ((b + orange >= s) && (b + orange <= t)) {
				orangeCount++;
			}
		}

		System.out.println(appleCount);
		System.out.println(orangeCount);
	}
}
