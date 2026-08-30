package br.com.samiac.problems.leetcode;

import java.util.Set;

public class GoatLatin {

	private final Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

	public String toGoatLatin(String sentence) {
		StringBuilder newSentence = new StringBuilder();

		String[] sentenceSplit = sentence.split(" ");

		for (int i = 0; i < sentenceSplit.length; i++) {
			String s = sentenceSplit[i];

			StringBuilder word = new StringBuilder(s);

			char[] chars = s.toCharArray();

			if (vowels.contains(chars[0])) {
				word.append("ma");
			} else {
				char c = word.charAt(0);
				word.deleteCharAt(0);
				word.append(c);
				word.append("ma");
			}

			int j = 0;
			while (j < i + 1) {
				word.append("a");
				j++;
			}

			newSentence.append(word);
			if (i < sentenceSplit.length - 1) {
				newSentence.append(" ");
			}
		}

		return newSentence.toString();
	}
}
