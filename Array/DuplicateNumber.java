/*
Approach:
1. Create a boolean array 'arr' of size n to keep track of visited numbers.
2. Traverse the input array 'nums'.
3. If arr[nums[i]] is already true, nums[i] has appeared before, so it is the duplicate.
4. Otherwise, mark arr[nums[i]] as visited and continue.

Time Complexity: O(n)
- We traverse the array once, and each lookup/update in the boolean array takes O(1) time.

Space Complexity: O(n)
- An extra boolean array of size n is used to store visited numbers.
*/

class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        boolean[] arr = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (arr[nums[i]])
                return nums[i];

            arr[nums[i]] = true;
        }

        return 0;
    }
}