package br.com.samiac.problems.hackerrank;

import java.util.List;

public class AngryProfessor {

	public static String angryProfessor(int k, List<Integer> a) {
		int inTime = 0;

		for (int index = 0; index < a.size(); index++) {
			if (a.get(index) <= 0) {
				inTime++;
			}
		}

		return inTime < k ? "YES" : "NO";
	}
}
