/*
Problem: LeetCode 438 - Find All Anagrams in a String

Category:
- Strings
- Sliding Window
- Hashing

Approach:
1. If p is longer than s, return an empty list.
2. Store the character frequencies of p and the first window of s.
3. If the frequencies match, add index 0 to the answer.
4. Slide the window one character at a time:
   - Add the new character entering the window.
   - Remove the character leaving the window.
5. Compare the frequency arrays after each shift.
6. If they are equal, add the starting index of the window to the answer.
7. Return the list of all starting indices.

Time Complexity: O(n)
- n = length of s
- Comparing two frequency arrays of size 26 takes constant time.

Space Complexity: O(1)
- Two frequency arrays of fixed size 26 are used.
- Output list is not counted as extra space.
*/

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();
        int n1 = s.length(), n2 = p.length();

        if (n2 > n1)
            return list;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < n2; i++) {
            freq1[s.charAt(i) - 'a']++;
            freq2[p.charAt(i) - 'a']++;
        }

        if (Arrays.equals(freq1, freq2)) {
            list.add(0);
        }

        for (int i = n2; i < n1; i++) {
            freq1[s.charAt(i) - 'a']++;
            freq1[s.charAt(i - n2) - 'a']--;

            if (Arrays.equals(freq1, freq2)) {
                list.add(i - n2 + 1);
            }
        }

        return list;
    }
}