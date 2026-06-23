/*
Approach:
1. Start with an initial altitude of 0.
2. Traverse the gain array and maintain a running sum representing the current altitude.
3. After each update, compare the current altitude with the maximum altitude seen so far.
4. Return the maximum altitude reached during the trip.

Time Complexity: O(n)
- We traverse the gain array once.

Space Complexity: O(1)
- Only constant extra space is used.
*/

class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0, sum = 0;

        for (int x : gain) {
            sum += x;
            max = Math.max(max, sum);
        }

        return max;
    }
}