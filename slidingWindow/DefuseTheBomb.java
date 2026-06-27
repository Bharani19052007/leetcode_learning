/*
Problem: LeetCode 1652 - Defuse the Bomb

Category:
- Sliding Window

Approach:
1. If k is 0, return an array filled with 0s.
2. Traverse each index of the array.
3. If k is positive, sum the next k elements using circular indexing.
4. If k is negative, sum the previous |k| elements using circular indexing.
5. Store the calculated sum for each position.
6. Return the resulting array.

Time Complexity: O(n × |k|)
- For each element, up to |k| elements are summed.

Space Complexity: O(n)
- Extra array is used to store the result.
*/

class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] res = new int[code.length];
        int n = code.length;

        if (k == 0) {
            return res;
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;

            if (k > 0) {
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % n];
                }
            } else {
                for (int j = 1; j <= -k; j++) {
                    sum += code[(i - j + n) % n];
                }
            }

            res[i] = sum;
        }

        return res;
    }
}