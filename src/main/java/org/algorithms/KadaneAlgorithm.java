package org.algorithms;

public class KadaneAlgorithm {

    /*
    Very often used to found the subarray max sum.
     */

    public KadaneAlgorithm() {
    }

    public static int findMaxSubarraySum(int[] array) {

        int globalMax = array[0];
        int currentMax = array[0];

        for (int i = 1; i < array.length ;i++) {
            currentMax = Math.max(array[i], currentMax + array[i]);
            globalMax = Math.max(globalMax, currentMax);
        }
        return globalMax;
    }

    public static void main(String[] args) {
        int[] array = {-1, 2, 3, -4, 3, 1, -1};

        int maxSum = KadaneAlgorithm.findMaxSubarraySum(array);

        System.out.println(maxSum);

    }

}
