/*
Problem: LeetCode 3 - Longest Substring Without Repeating Characters

Category:
- Sliding Window

Approach:
1. Use two pointers (left and right) to maintain a sliding window.
2. Use a HashSet to store the characters currently in the window.
3. Expand the window by moving the right pointer.
4. If a duplicate character is found, shrink the window from the left until all characters are unique.
5. Update the maximum window length after each valid expansion.
6. Return the maximum length found.

Time Complexity: O(n)
- Each character is added to and removed from the HashSet at most once.

Space Complexity: O(min(n, m))
- m is the size of the character set.
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        HashSet<Character> charSet = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }

            charSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}