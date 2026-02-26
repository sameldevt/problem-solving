package br.com.samiac.problems.hackerrank;

import java.util.HashSet;
import java.util.Set;

public class TwoStrings {

	public static String twoStrings(String s1, String s2) {

		Set<Character> setS1 = new HashSet<>();
		Set<Character> setS2 = new HashSet<>();

		for(Character c : s1.toCharArray()){
			setS1.add(c);
		}

		for(Character c : s2.toCharArray()){
			setS2.add(c);
		}

		for(Character c : setS1){
			if(setS2.contains(c)){
				return "YES";
			}
		}

		return "NO";
	}
}
