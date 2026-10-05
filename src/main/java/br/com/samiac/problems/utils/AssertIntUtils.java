package br.com.samiac.problems.utils;

public class AssertIntUtils {

	public static void assertEquals(int actual, int expected) {
		if (actual == expected) {
			System.out.println("OK");
		} else {
			System.out.println("ERROR. Expected: " + expected + " Actual: " + actual);
		}
	}
}
