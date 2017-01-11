/*
    Take the transpose and then flip the columns.
    For an ACW rotation, flip the rows.
*/

public class Solution {
    public void rotate(int[][] matrix) {
        int ROWS = matrix.length;
        int COLS = matrix[0].length;
        
        //transpose
        for (int i = 0; i < ROWS; i++) {
            for (int j = i; j < COLS; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        
        //flip columns
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < ROWS/2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][ROWS-j-1];
                matrix[i][ROWS-j-1] = temp;
                
            }
        }
    }
}