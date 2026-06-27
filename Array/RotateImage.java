/*
Problem: LeetCode 48 - Rotate Image

Category:
- Matrix

Approach:
1. Transpose the matrix by swapping matrix[i][j] with matrix[j][i].
2. Reverse each row of the transposed matrix.
3. The matrix is rotated 90 degrees clockwise in-place.

Time Complexity: O(n²)
- Transposing and reversing together visit each element a constant number of times.

Space Complexity: O(1)
- Rotation is performed in-place.
*/

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;

            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}