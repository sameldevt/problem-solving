package br.com.samiac.problems.hackerrank;

public class MarsExploration {

	/*
		SOS OOS OSO SOS OSS OSO SOS OSO SOS
	 */
	public static int marsExploration(String s) {

		int changes = 0;

		for (int index = 0; index < s.length(); index += 3) {

			String sub = s.substring(index, index + 3);

			if (!sub.equals("SOS")) {

				if(sub.charAt(0) != 'S'){
					changes++;
				}

				if(sub.charAt(1) != 'O'){
					changes++;
				}

				if(sub.charAt(2) != 'S'){
					changes++;
				}
			}
		}

		return changes;
	}
}
