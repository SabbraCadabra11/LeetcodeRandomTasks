package dw.easyTasks;
/*
Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal
and all the elements on the secondary diagonal that are not part of the primary diagonal.

Example 1:
Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.

Example 2:
Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8

Example 3:
Input: mat = [[5]]
Output: 5

Constraints:
n == mat.length == mat[i].length
1 <= n <= 100
1 <= mat[i][j] <= 100
*/
public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        if (mat.length == 1)
            return mat[0][0];

        int sum = 0;
        final byte lastIndex = (byte) (mat.length - 1);
        for (byte i = 0; i <= lastIndex; i++) {
            //primary diagonal
            sum += mat[i][i];
            //secondary diagonal
            sum += mat[lastIndex - i][i];
        }
        if (mat.length % 2 != 0) {
            byte middle = (byte) (mat.length / 2);
            sum -= mat[middle][middle];
        }
        return sum;
    }
}
















