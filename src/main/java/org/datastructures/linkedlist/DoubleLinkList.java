package org.datastructures.linkedlist;

/*
TO-DO later
 */

public class DoubleLinkList {
        public int maxSubArray(int[] nums) {
                int maxSum = nums[0];
                int currentSum = nums[0];

                for (int i = 1; i < nums.length; i++) {
                        currentSum = Math.max(nums[i], currentSum + nums[i]);
                        maxSum = Math.max(maxSum, currentSum);
                }
                return maxSum;
        }


}
