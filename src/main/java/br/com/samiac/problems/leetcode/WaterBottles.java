package br.com.samiac.problems.leetcode;

public class WaterBottles {

	public int numWaterBottles(int numBottles, int numExchange) {

		int canDrink = numBottles;
		int empty = numBottles;

		while (empty >= numExchange) {
			int full = empty / numExchange;
			empty = full + empty % numExchange;
			canDrink += full;
		}

		return canDrink;
	}
}
