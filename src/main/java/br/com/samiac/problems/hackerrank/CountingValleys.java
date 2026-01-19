package br.com.samiac.problems.hackerrank;

public class CountingValleys {

	/*
	 DDUUDDUDUUUD

	 _          /\_
	  \  /\    /
	   \/  \/\/
	 */
	public static int countingValleys(int steps, String path) {
		int valleys = 0;

		int currentLevel = 0;

		boolean valleyCounted = false;

		for (int index = 0; index < steps; index++) {

			if (path.charAt(index) == 'U') {
				currentLevel++;
			} else {
				currentLevel--;
			}

			if (currentLevel < 0 && !valleyCounted) {
				valleys++;
				valleyCounted = true;
			} else if(currentLevel >= 0){
				valleyCounted = false;
			}
		}

		return valleys;
	}
}
