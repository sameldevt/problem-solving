package br.com.samiac.problems.hackerrank;

import java.util.List;

public class DesignerPDFViewer {

	// time = o(n)
	public static int designerPdfViewer(List<Integer> h, String word) {

		int highest = 0;

		for (int index = 0; index < word.length(); index++) {

			int charIndex = word.charAt(index) - 'a';

			if (h.get(charIndex) > highest) {
				highest = h.get(charIndex);
			}

		}

		return highest * word.length();
	}

}
