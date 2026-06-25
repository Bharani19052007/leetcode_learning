/*
Problem: LeetCode 485 - Max Consecutive Ones

Category:
- Arrays

Approach:
1. Traverse the array.
2. Count consecutive 1s.
3. When a 0 is encountered, store the current count and reset it.
4. After the traversal, add the final count.
5. Return the maximum count stored in the list.

Time Complexity: O(n)
- Traverse the array once.

Space Complexity: O(n)
- In the worst case, the ArrayList stores counts for multiple sequences.
*/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                a.add(count);
                count = 0;
            }
        }

        a.add(count);
        return Collections.max(a);
    }
}