package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            // Map -> number that gets target, index
            map.put(target - nums[i], i);
        }
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])) {
                return new int[]{i, map.get(nums[i])};
            }
        }
        return new int[2];
    }
}
