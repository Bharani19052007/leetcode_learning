/*
Approach:
1. Convert the string into a character array for easy modification.
2. Use two pointers: one starting from the beginning and the other from the end.
3. Move the pointers until they point to vowels.
4. Swap the vowels and continue moving the pointers inward.
5. Repeat until the two pointers meet.
6. Convert the character array back to a string and return it.

Time Complexity: O(n)
- Each character is visited at most once.

Space Complexity: O(n)
- A character array of size n is used to store the modified string.
*/

class Solution {
    public String reverseVowels(String s) {
        char[] a = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            while (start < end && !isVowel(a[start])) {
                start++;
            }
            while (start < end && !isVowel(a[end])) {
                end--;
            }

            char temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;
        }

        return new String(a);
    }

    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}