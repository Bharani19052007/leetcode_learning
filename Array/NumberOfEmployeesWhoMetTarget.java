/*
Problem: LeetCode 2798 - Number of Employees Who Met the Target

Category:
- Arrays
- Counting

Approach:
1. Traverse the hours array.
2. For each employee, check if the number of hours worked is greater than or equal to the target.
3. If yes, increment the count.
4. Return the total count.

Time Complexity: O(n)
- Traverse the array once.

Space Complexity: O(1)
- Only one variable is used.
*/

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;

        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) {
                count++;
            }
        }

        return count;
    }
}