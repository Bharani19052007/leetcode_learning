/*
Problem: LeetCode 344 - Reverse String

Category:
- Two Pointers

Approach:
1. Initialize two pointers:
   - One at the beginning.
   - One at the end.
2. Swap the characters at both pointers.
3. Move the pointers toward the center.
4. Continue until they meet.

Time Complexity: O(n)
- Each character is visited once.

Space Complexity: O(1)
- In-place reversal with constant extra space.
*/

class Solution {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }
}