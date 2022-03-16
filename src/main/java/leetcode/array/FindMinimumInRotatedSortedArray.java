package leetcode.array;

public class FindMinimumInRotatedSortedArray {

	public int findMin(int[] nums) {
		int left = 0, right = nums.length - 1;
		while(left <= right) {
			int mid = left + (right - left) / 2;
			if(mid> 0 && nums[mid] < nums[mid - 1])
				return nums[mid];
			if(nums[mid] >= nums[left] && nums[mid] > nums[right])
				left = mid + 1;
			else
				right = mid - 1;

		}

		return nums[left];
	}
	
}
