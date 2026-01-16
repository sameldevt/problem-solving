package br.com.samiac.problems.leetcode;

public class SearchInsertPosition {

	public static int searchInsert(int[] nums, int target) {

		int wouldBeInsertedAt = 0;

		for(int index = 0; index < nums.length; index++){
			if(nums[index] == target){
				return index;
			}

			if(nums[index] > target){
				wouldBeInsertedAt = index;
				break;
			}

			if(index + 1 == nums.length){
				wouldBeInsertedAt = index + 1;
			}

		}

		return wouldBeInsertedAt;
	}
}
