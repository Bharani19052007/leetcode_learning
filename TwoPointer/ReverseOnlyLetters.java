/*
Problem: LeetCode 917 - Reverse Only Letters

Category:
- Two Pointers

Approach:
1. Convert the string into a character array.
2. Initialize two pointers:
   - left at the beginning.
   - right at the end.
3. Skip non-letter characters.
4. When both pointers point to letters, swap them.
5. Move both pointers inward and continue until they meet.
6. Convert the character array back to a string.

Time Complexity: O(n)
- Each character is visited at most once.

Space Complexity: O(n)
- Character array is used to modify the string.
*/

class Solution {
    public String reverseOnlyLetters(String s) {
        int left = 0, right = s.length() - 1;
        char[] arr = s.toCharArray();

        while (left < right) {
            if (!Character.isLetter(arr[left])) {
                left++;
            } else if (!Character.isLetter(arr[right])) {
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return new String(arr);
    }
}