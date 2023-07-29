package org.example.twosum;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        int firstResult = 0;
        int secondResult = 0;

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i + 1 ; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    firstResult = i;
                    secondResult = j;
                    break;
                }
            }
        }
        return new int[]{firstResult, secondResult};
    }
}
