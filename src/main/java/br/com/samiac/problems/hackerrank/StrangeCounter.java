package br.com.samiac.problems.hackerrank;

public class StrangeCounter {

	public static long strangeCounter(long t) {

		long value = 3;
		long time = 1;

		long previousValue = value;
		long previousTime = time;

		while (true) {

			if (time > t) {

				time = previousTime;
				value = previousValue;

				return value + (time - t);

			}

			previousTime = time;
			previousValue = value;

			time = previousTime + previousValue;
			value = previousValue * 2;

		}
	}
}
