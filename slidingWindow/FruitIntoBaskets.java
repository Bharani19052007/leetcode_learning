/*
Problem: LeetCode 904 - Fruit Into Baskets

Category:
- Sliding Window

Approach:
1. Use a variable-size sliding window with two pointers.
2. Store the frequency of each fruit type in a HashMap.
3. Expand the window by moving the right pointer.
4. If the window contains more than two distinct fruit types, shrink it from the left until only two remain.
5. Update the maximum window size after each valid window.
6. Return the maximum number of fruits collected.

Time Complexity: O(n)
- Each element enters and leaves the window at most once.

Space Complexity: O(1)
- The HashMap stores at most 3 fruit types, so the extra space is constant.
*/

class Solution {
    public int totalFruit(int[] fruits) {
        int start = 0, end = 0, max = 0;
        int n = fruits.length;

        Map<Integer, Integer> map = new HashMap<>();

        while (end < n) {
            map.put(fruits[end], map.getOrDefault(fruits[end], 0) + 1);

            while (map.size() >= 3) {
                map.put(fruits[start], map.get(fruits[start]) - 1);

                if (map.get(fruits[start]) == 0) {
                    map.remove(fruits[start]);
                }

                start++;
            }

            max = Math.max(max, end - start + 1);
            end++;
        }

        return max;
    }
}