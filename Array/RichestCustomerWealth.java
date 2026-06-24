/*
Problem: LeetCode 1672 - Richest Customer Wealth

Category:
- Arrays
- Matrix (2D Array)

Approach:
1. Traverse each row (customer) in the 2D array.
2. Calculate the sum of all accounts for that customer.
3. Keep track of the maximum sum encountered.
4. Return the maximum wealth.

Time Complexity: O(m × n)
- m = number of customers (rows)
- n = number of bank accounts (columns)

Space Complexity: O(1)
- Only a few variables are used.
*/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int rich = 0;

        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }

            rich = Math.max(rich, wealth);
        }

        return rich;
    }
}