package br.com.samiac.challenges;

public class NumberLineJumps {

	public static String kangaroo(int x1, int v1, int x2, int v2) {

		int count = 0;

		while(count < 10000){
			int x1Pos = x1 + v1;
			int x2Pos = x2 + v2;

			if(x1Pos == x2Pos){
				return "YES";
			}

			x1 = x1Pos;
			x2 = x2Pos;

			count++;
		}

		return "NO";
	}
}
