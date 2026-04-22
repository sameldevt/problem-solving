package br.com.samiac.problems.leetcode;

public class FindTheIndexOfTheFirstOccurrenceInAString {

	public static int strStr(String haystack, String needle) {

		for (int index = 0; index < haystack.length(); index++) {
			char c = haystack.charAt(index);

			if (c == needle.charAt(0)) {
				int i = 0;
				int firstIndex = index;

				while (i < needle.length() && index + i < haystack.length()) {
					char cHaystack = haystack.charAt(index + i);
					char cNeedle = needle.charAt(i);

					if (cHaystack == cNeedle) {
						i++;
					} else {
						break;
					}

					if(i == needle.length()){
						return firstIndex;
					}
				}
			}
		}

		return -1;
	}
}
