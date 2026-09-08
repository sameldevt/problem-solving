package br.com.samiac.problems.leetcode;

public class LongestCommonPrefix {

	class TrieNode {

		TrieNode[] children = new TrieNode[26];

		boolean endOfWord;

	}

	public String longestCommonPrefix(String[] strs) {

		TrieNode root = new TrieNode();

		for (String word : strs) {

			if (word.isEmpty()) {
				return "";
			}

			TrieNode current = root;

			for (char c : word.toCharArray()) {
				int index = c - 'a';

				if (current.children[index] == null) {
					current.children[index] = new TrieNode();
				}

				current = current.children[index];
			}

			current.endOfWord = true;
		}

		StringBuilder sb = new StringBuilder();

		TrieNode current = root;

		while (current != null) {

			if (current.endOfWord) {
				break;
			}

			int index = -1;
			int q = 0;

			for (int i = 0; i < current.children.length; i++) {
				if (current.children[i] != null) {
					index = i;
					q++;
				}
			}

			if (q != 1) {
				break;
			}

			sb.append((char) (index + 'a'));
			current = current.children[index];
		}

		return sb.toString();
	}
}
