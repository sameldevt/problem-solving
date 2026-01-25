package br.com.samiac.problems.hackerrank;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class CircularArrayRotation {

	/*
		solution 1

		public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
			Deque<Integer> deque = new ArrayDeque<>(a);

			for (int count = 0; count < k; count++) {
				deque.addFirst(deque.removeLast());
			}

			List<Integer> dequeList = new ArrayList<>(deque);
			List<Integer> newList = new ArrayList<>();

			for (int q : queries) {
				newList.add(dequeList.get(q));
			}

			return newList;
		}
		---

		solution 2

		public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
			Deque<Integer> deque = new ArrayDeque<>(a);

			int x = k;

			if (k >= a.size()) {
				x = 0;
			}

			if (k > a.size() && k % a.size() != 0) {
				double div = (double) k / a.size();
				double diff = div - Math.floor(div);
				double mult = diff * a.size();

				x = (int) mult;
			}

			for (int count = 0; count < x; count++) {
				deque.addFirst(deque.removeLast());
			}

			List<Integer> dequeList = new ArrayList<>(deque);
			List<Integer> newList = new ArrayList<>();

			for (int q : queries) {
				newList.add(dequeList.get(q));
			}

			return newList;
    	}
    	---

    	gpt solution
		public static List<Integer> circularArrayRotation(
			List<Integer> a, int k, List<Integer> queries) {

			int n = a.size();
			int rotation = k % n;

			List<Integer> result = new ArrayList<>(queries.size());

			for (int q : queries) {
				int index = (q - rotation + n) % n;
				result.add(a.get(index));
			}

			return result;
		}
	 */
	public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
		Deque<Integer> deque = new ArrayDeque<>(a);

		for (int count = 0; count < k % a.size(); count++) {
			deque.addFirst(deque.removeLast());
		}

		List<Integer> dequeList = new ArrayList<>(deque);
		List<Integer> newList = new ArrayList<>();

		for (int q : queries) {
			newList.add(dequeList.get(q));
		}

		return newList;
	}
}
