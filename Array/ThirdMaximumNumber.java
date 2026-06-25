/*
Problem: LeetCode 414 - Third Maximum Number

Category:
- Hashing,Arrays

Approach:
1. Insert all elements into a HashSet to remove duplicates.
2. If there are fewer than three distinct numbers, return the maximum element.
3. Remove the maximum element twice.
4. Return the maximum of the remaining set, which is the third maximum.

Time Complexity: O(n)
- Building the HashSet takes O(n).
- Collections.max() is called a constant number of times.

Space Complexity: O(n)
- HashSet stores all distinct elements.
*/

class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        Set<Integer> s = new HashSet<>();

        for (int i : nums) {
            s.add(i);
        }

        if (s.size() < 3)
            return Collections.max(s);

        s.remove(Collections.max(s));
        s.remove(Collections.max(s));

        return Collections.max(s);
    }
}