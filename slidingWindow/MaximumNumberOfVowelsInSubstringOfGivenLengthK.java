/*
Problem: LeetCode 1456 - Maximum Number of Vowels in a Substring of Given Length K

Category:
- Strings
- Sliding Window
- Counting

Approach:
1. Count the vowels in the first window of size k.
2. Store this count as the initial answer.
3. Slide the window one character at a time:
   - Add the new character if it is a vowel.
   - Remove the character leaving the window if it is a vowel.
4. Update the maximum count after each shift.
5. Return the maximum number of vowels found in any window of size k.

Time Complexity: O(n)
- Each character is visited once.

Space Complexity: O(1)
- Only a few variables are used.
*/

class Solution {

    public boolean isvowel(char c) {
        return c == 'a' || c == 'e' || c == 'i'
            || c == 'o' || c == 'u';
    }

    public int maxVowels(String s, int k) {
        int max = 0, count = 0;

        // First window
        for (int i = 0; i < k; i++) {
            if (isvowel(s.charAt(i))) {
                count++;
            }
        }

        max = count;

        // Slide the window
        for (int i = k; i < s.length(); i++) {

            if (isvowel(s.charAt(i))) {
                count++;
            }

            if (isvowel(s.charAt(i - k))) {
                count--;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}