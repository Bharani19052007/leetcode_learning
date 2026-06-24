/*
Problem: LeetCode 1295 - Find Numbers with Even Number of Digits

Category:
- Arrays
- Math

Approach:
1. Traverse each number in the array.
2. Count the number of digits by repeatedly dividing the number by 10.
3. If the digit count is even, increment the answer.
4. Return the total count.

Time Complexity: O(n × d)
- n = number of elements
- d = number of digits in each number

Space Complexity: O(1)
- Only constant extra space is used.
*/

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int dig = 0;

            while (temp > 0) {
                dig++;
                temp /= 10;
            }

            if (dig % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}