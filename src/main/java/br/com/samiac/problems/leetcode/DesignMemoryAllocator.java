package br.com.samiac.problems.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DesignMemoryAllocator {

	private final int[] mem;

	private final Map<Integer, List<List<Integer>>> memMap;

	public DesignMemoryAllocator(int n) {
		this.mem = new int[n];

		Arrays.fill(mem, Integer.MAX_VALUE);

		this.memMap = new HashMap<>();
	}

	public int allocate(int size, int mID) {
		int firstAddress = Integer.MIN_VALUE;
		int lastAddress = Integer.MIN_VALUE;

		for (int index = 0; index < mem.length; index++) {
			if (mem[index] == Integer.MAX_VALUE) {
				firstAddress = index;

				int counter = index;

				while (counter < index + size) {

					if (counter >= mem.length) {
						return -1;
					}

					if (mem[counter] != Integer.MAX_VALUE) {
						index = counter;
						firstAddress = Integer.MIN_VALUE;
						break;
					}

					lastAddress = counter;
					counter++;
				}

				if (firstAddress != Integer.MIN_VALUE) {
					break;
				}
			}
		}

		if (firstAddress == Integer.MIN_VALUE) {
			return -1;
		}

		int address = firstAddress;

		while (address <= lastAddress) {
			mem[address] = mID;
			address++;
		}
//
//		if (memMap.containsKey(mID)) {
//			List<List<Integer>> list = memMap.get(mID);
//			list.add(List.of(firstAddress, lastAddress));
//		} else {
//			List<List<Integer>> list = new ArrayList<>();
//			list.add(List.of(firstAddress, lastAddress));
//			memMap.put(mID, list);
//		}

		return firstAddress;
	}

	public int freeMemory(int mID) {
		int units = 0;

		for (int index = 0; index < mem.length; index++) {
			if (this.mem[index] == mID) {
				this.mem[index] = Integer.MAX_VALUE;
				units++;
			}
		}

		return units;
	}

	 /*
	 	public int freeMemory(int mID) {
		List<List<Integer>> allocated = memMap.get(mID);

		if (allocated == null) {
			return 0;
		}

		int units = 0;

		for (List<Integer> all : allocated) {
			for (int index = 0; index < all.size(); index++) {
				this.mem[index] = Integer.MAX_VALUE;
				units++;
			}
		}

		return units;
	}
	  */
}
