/*
Problem: LeetCode 567 - Permutation in String

Category:
- Strings
- Sliding Window
- Hashing

Approach:
1. If s1 is longer than s2, return false.
2. Store character frequencies of s1 and the first window of s2.
3. Compare both frequency arrays.
4. Slide the window one character at a time:
   - Add the new character to the window frequency.
   - Remove the character leaving the window.
5. If the frequency arrays match at any point, a permutation of s1 exists in s2.
6. Otherwise, return false.

Time Complexity: O(n)
- n = length of s2
- Comparing two frequency arrays of size 26 takes constant time.

Space Complexity: O(1)
- Two frequency arrays of fixed size 26 are used.
*/

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        if (n2 < n1)
            return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < n1; i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(freq1, freq2))
            return true;

        for (int i = n1; i < n2; i++) {
            freq2[s2.charAt(i) - 'a']++;
            freq2[s2.charAt(i - n1) - 'a']--;

            if (Arrays.equals(freq1, freq2))
                return true;
        }

        return false;
    }
}