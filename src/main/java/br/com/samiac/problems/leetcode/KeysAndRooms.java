package br.com.samiac.problems.leetcode;

import java.util.List;

public class KeysAndRooms {

	public boolean canVisitAllRooms(List<List<Integer>> rooms) {
		boolean[] visited = new boolean[rooms.size()];

		traverse(rooms, visited, 0);

		for (boolean v : visited) {
			if (!v) {
				return false;
			}
		}

		return true;
	}

	private void traverse(List<List<Integer>> rooms, boolean[] visited, int index) {

		if (!visited[index]) {
			return;
		}

		visited[index] = true;
		for (int i : rooms.get(index)) {
			traverse(rooms, visited, i);
		}
	}
}
