/*
 * Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
You must do it in place.

Example 1:
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]

Example 2:
Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 
Constraints:
m == matrix.length
n == matrix[0].length
1 <= m, n <= 200
-231 <= matrix[i][j] <= 231 - 1
 
Follow up:
A straightforward solution using O(mn) space is probably a bad idea.
A simple improvement uses O(m + n) space, but still not the best solution.
Could you devise a constant space solution?
*/


public class SetMatrixZeros {
    
}
class Solution {
    public void setZeroes(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        boolean fcol = false;
        boolean frow = false;
        for (int i = 0; i < rows; i++) {
            if (mat[i][0] == 0) {
                fcol = true;
                break;
            }
        }
        for (int i = 0; i < cols; i++) {
            if (mat[0][i] == 0) {
                frow = true;
                break;
            }
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (mat[i][j] == 0) {
                    mat[0][j] = 0;
                    mat[i][0] = 0;
                }
            }
        }
        for (int i = 1; i < rows; i++) {
            if (mat[i][0] == 0) {
                //Arrays.fill(mat[i], 0);
            }
        }
        for (int j = 1; j < cols; j++) {
            if (mat[0][j] == 0) {
                for (int i = 1; i < rows; i++) {
                    mat[i][j] = 0;
                }
            }
        }
        if (fcol) {
            for (int i = 0; i < rows; i++) {
                mat[i][0] = 0;
            }
        }
        if (frow) {
            //Arrays.fill(mat[0], 0);
        }
    }
}
