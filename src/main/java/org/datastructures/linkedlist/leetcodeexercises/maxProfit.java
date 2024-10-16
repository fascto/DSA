package org.datastructures.linkedlist.leetcodeexercises;

public class maxProfit {

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            int potentialProfit = prices[i] - minPrice;

            maxProfit = Math.max(maxProfit, potentialProfit);

            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;
    }


    public static void main(String[] args) {
        int[] prices = {4, 5, 6, 1, 2, 9};

        System.out.println(maxProfit(prices));
    }
}
