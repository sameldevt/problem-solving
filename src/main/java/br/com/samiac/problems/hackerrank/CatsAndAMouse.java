package br.com.samiac.problems.hackerrank;

public class CatsAndAMouse {

	public static String catAndMouse(int x, int y, int z) {

		String result;

		int catAtoMouse = Math.abs(x - z);
		int catBtoMouse = Math.abs(y - z);

		if (catAtoMouse > catBtoMouse) {
			result = "Cat B";
		} else if (catAtoMouse < catBtoMouse) {
			result = "Cat A";
		} else {
			result = "Mouse C";
		}

		return result;
	}
}
