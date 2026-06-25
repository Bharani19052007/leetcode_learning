/*
Problem: LeetCode 121 - Best Time to Buy and Sell Stock

Category:
- Greedy,Arrays

Approach:
1. Initialize the minimum buying price with the first day's price.
2. Traverse the array from the second day.
3. Calculate the profit if the stock is sold on the current day.
4. Update the maximum profit if the current profit is greater.
5. Update the minimum buying price whenever a lower price is found.
6. Return the maximum profit.

Time Complexity: O(n)
- Traverse the array once.

Space Complexity: O(1)
- Only constant extra space is used.
*/

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0, start = prices[0];

        for (int i = 1; i < n; i++) {
            max = Math.max(prices[i] - start, max);
            start = Math.min(prices[i], start);
        }

        return max;
    }
}