/*
Approach:
1. Use two pointers, one at the beginning (left) and one at the end (right) of the sorted array.
2. Calculate the sum of elements at both pointers.
3. If the sum equals the target, return their 1-based indices.
4. If the sum is greater than the target, move the right pointer to decrease the sum.
5. If the sum is smaller than the target, move the left pointer to increase the sum.
6. Continue until the pair is found.

Time Complexity: O(n)
- Each element is visited at most once by either pointer.

Space Complexity: O(1)
- No extra space is used apart from the output array.
*/

class Solution {
    public int[] twoSum(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (arr[left] + arr[right] == target) {
                return new int[]{left + 1, right + 1};
            } else if (arr[left] + arr[right] > target) {
                right--;
            } else {
                left++;
            }
        }

        return new int[]{0, 0};
    }
}