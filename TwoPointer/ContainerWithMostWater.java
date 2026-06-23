/*
Approach:
1. Initialize two pointers, one at the beginning (left) and one at the end (right) of the array.
2. Calculate the area formed by the lines at both pointers:
   area = (right - left) * min(height[left], height[right]).
3. Update the maximum area found so far.
4. Move the pointer with the smaller height inward, since moving the taller one cannot increase the area.
5. Repeat until the two pointers meet.

Time Complexity: O(n)
- Each pointer moves at most n times.

Space Complexity: O(1)
- Only constant extra space is used.
*/

class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            maxArea = Math.max(maxArea,
                    (right - left) * Math.min(height[left], height[right]));

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}