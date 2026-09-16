package br.com.samiac.problems.leetcode;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {

	//	public String[] findWords(String[] words) {
	//
	//		Set<Character> setRow1 = new HashSet<>();
	//		Set<Character> setRow2 = new HashSet<>();
	//		Set<Character> setRow3 = new HashSet<>();
	//
	//		fillSet(setRow1, "qwertyuiop");
	//		fillSet(setRow2, "asdfghjkl");
	//		fillSet(setRow3, "zxcvbnm");
	//
	//		List<String> wordList = new ArrayList<>();
	//
	//		boolean fit = false;
	//
	//		for (String word : words) {
	//
	//			String word1 = word.toLowerCase();
	//
	//			List<Character> letters = word1.chars().mapToObj(c -> (char) c).toList();
	//
	//			if (setRow1.containsAll(letters)) {
	//				fit = true;
	//			}
	//
	//			if (setRow2.containsAll(letters)) {
	//				fit = true;
	//			}
	//
	//			if (setRow3.containsAll(letters)) {
	//				fit = true;
	//			}
	//
	//			if (fit) {
	//				wordList.add(word);
	//			}
	//
	//			fit = false;
	//		}
	//
	//		String[] wordArr = new String[wordList.size()];
	//
	//		for (int i = 0; i < wordArr.length; i++) {
	//			wordArr[i] = wordList.get(i);
	//		}
	//
	//		return wordArr;
	//	}
	//
	//	private void fillSet(Set<Character> set, String str) {
	//		for (char c : str.toCharArray()) {
	//			set.add(c);
	//		}
	//	}

	public String[] findWords(String[] words) {
		String row1 = "qwertyuiop";
		String row2 = "asdfghjkl";
		String row3 = "zxcvbnm";

		List<String> list = new ArrayList<>();

		for (String word : words) {
			String word1 = word.toLowerCase();
			String toSearch;

			if(row1.indexOf(word1.charAt(0)) != -1){
				toSearch = row1;
			} else if(row2.indexOf(word1.charAt(0)) != -1){
				toSearch = row2;
			} else {
				toSearch = row3;
			}

			boolean fit = true;

			for (char c : word1.toCharArray()){
				if(toSearch.indexOf(c) == -1){
					fit = false;
					break;
				}
			}

			if(fit){
				list.add(word);
			}
		}

		return list.toArray(new String[0]);
	}
}
