/*
Problem: LeetCode 125 - Valid Palindrome

Category:
- Two Pointers

Approach:
1. Initialize two pointers:
   - start at the beginning.
   - end at the end.
2. Skip all non-alphanumeric characters.
3. Compare the remaining characters:
   - Ignore case for letters.
   - Compare digits directly.
4. If any comparison fails, return false.
5. Continue until the pointers meet.
6. If all valid characters match, return true.

Time Complexity: O(n)
- Each character is visited at most once.

Space Complexity: O(1)
- Only constant extra space is used.
*/

class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (Character.isLetter(s.charAt(start)) && Character.isLetter(s.charAt(end))) {
                if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
                    return false;
                start++;
                end--;
            } else if (Character.isDigit(s.charAt(start)) && Character.isDigit(s.charAt(end))) {
                if (s.charAt(start) != s.charAt(end))
                    return false;
                start++;
                end--;
            } else if (!Character.isLetter(s.charAt(start)) && !Character.isDigit(s.charAt(start))) {
                start++;
            } else if (!Character.isLetter(s.charAt(end)) && !Character.isDigit(s.charAt(end))) {
                end--;
            } else {
                return false;
            }
        }

        return true;
    }
}