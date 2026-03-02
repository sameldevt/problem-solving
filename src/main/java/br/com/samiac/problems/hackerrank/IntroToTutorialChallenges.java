package br.com.samiac.problems.hackerrank;

import java.util.List;

public class IntroToTutorialChallenges {

	public static int introTutorial(int V, List<Integer> arr) {

		int i = 0;

		for(int index = 0; index < arr.size(); index++){
			if(arr.get(index) == V){
				i = index;
				break;
			}
		}

		return i;
	}
}
