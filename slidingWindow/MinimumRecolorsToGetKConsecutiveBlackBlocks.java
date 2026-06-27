/*
Problem: LeetCode 2379 - Minimum Recolors to Get K Consecutive Black Blocks

Category:
- Sliding Window

Approach:
1. Count the number of white blocks ('W') in the first window of size k.
2. Store this count as the initial minimum.
3. Slide the window one position at a time:
   - Add the new character entering the window.
   - Remove the character leaving the window.
4. Update the minimum number of white blocks found.
5. Return the minimum count, which represents the minimum recolors needed.

Time Complexity: O(n)
- Each character is processed once.

Space Complexity: O(1)
- Only a few variables are used.
*/

class Solution {
    public int minimumRecolors(String blocks, int k) {
        char[] arr = blocks.toCharArray();

        int count = 0;

        for (int i = 0; i < k; i++) {
            if (arr[i] == 'W') {
                count++;
            }
        }

        int min_cnt = count;

        for (int i = k; i < arr.length; i++) {
            if (arr[i] == 'W') {
                count++;
            }

            if (arr[i - k] == 'W') {
                count--;
            }

            min_cnt = Math.min(min_cnt, count);
        }

        return min_cnt;
    }
}