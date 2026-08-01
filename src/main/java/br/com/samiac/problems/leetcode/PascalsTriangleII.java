package br.com.samiac.problems.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {

	public List<Integer> getRow(int rowIndex) {
		List<List<Integer>> triangle = new ArrayList<>();

		if(rowIndex == 0){
			return List.of(1);
		}

		if(rowIndex == 1){
			return List.of(1, 1);
		}

		triangle.add(List.of(1));
		triangle.add(List.of(1, 1));

		int count = 2;

		while (count <= rowIndex) {
			List<Integer> r = triangle.get(count - 1);
			List<Integer> nR = new ArrayList<>();

			nR.add(1);
			for (int index = 0; index < r.size(); index++) {
				if (index + 1 < r.size()) {
					nR.add(r.get(index) + r.get(index + 1));
				}
			}
			nR.add(1);
			triangle.add(nR);
			count++;
		}

		return triangle.getLast();
	}
}
