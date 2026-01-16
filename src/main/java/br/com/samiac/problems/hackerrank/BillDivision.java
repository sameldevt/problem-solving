package br.com.samiac.problems.hackerrank;

import java.util.List;

public class BillDivision {

	public static void bonAppetit(List<Integer> bill, int k, int b) {

		int billTotal = 0;

		for (int index = 0; index < bill.size(); index++) {
			billTotal += bill.get(index);
		}

		int billTotalForAnna = (billTotal - bill.get(k)) / 2;

		if (billTotalForAnna < b) {
			System.out.println(b - billTotalForAnna);
		} else if (billTotalForAnna > b) {
			System.out.println(billTotalForAnna - b);
		} else {
			System.out.println("Bon Appetit");
		}

	}
}
