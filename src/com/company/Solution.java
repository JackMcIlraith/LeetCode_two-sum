package com.company;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            int targetSum = target - nums[i];
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] == targetSum){
                    return new int[]{i,j};
                }
            }
        }
        return null; //only if no solution is found
    }
}
