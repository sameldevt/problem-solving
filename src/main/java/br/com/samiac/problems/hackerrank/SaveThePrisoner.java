package br.com.samiac.problems.hackerrank;

public class SaveThePrisoner {

	/*
		n : the number of prisoners
		m : the number of sweets
		s : the chair number to start passing out treats at

		---
		n -> 5
		m -> 2
		s -> 1

		r -> 2

		---
		n -> 5 = 1/5 = 20%
		m -> 2 = 2/5 = 40%
		s -> 2 = 2/5 = 40%

		r -> 3

		---
		n -> 7  = 1/7  = 14,3%
		m -> 19 = 19/7 = 271%
		s -> 2  = 2/7  = 28,6%

		r -> 6

		m / n = 2.714285714285714

		---
		n -> 3
		m -> 7
		s -> 3

		3 1 2 3 1 2 3

		m / n = 2.33 = 2 + 1/3
		1 / n = 0.33 = 1/3
		s / n = 1 +

		r -> 3

		---
		n -> 3
		m -> 6
		s -> 1

		1 2 3 1 2 3

		m / n = 2
		s / n = 0.33


		r -> 3
		---

		352926151 380324688 94730870

		double r = (double) (m - (n - (s - 1))) / n;

		if (r % 2 == 0 || r % 3 == 0) {
			return (int) r;
		}

		double x1 = r - Math.floor(r);
		double x = x1 * n;

		return (int) x;

		352926151
		380324688
		 94730870

		---

		208526924
		756265725
		150817879

		correct =  72975907
		exec    = 281502831

		499999999
	*/
	public static int saveThePrisoner(int n, int m, int s) {
		int result = (s + m - 1) % n;
		return result == 0 ? n : result;
	}
}
