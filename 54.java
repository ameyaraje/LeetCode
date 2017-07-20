/*
    Kind of weird to handle all indices.
    Idea is just to keep drawing circles.
*/
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        if (matrix.length == 0 || matrix[0].length == 0)
            return result;
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int i1 = 0;
        int i2 = 0;
        
        while (rows > 0 && cols > 0) {
            if (rows == 1) {
                for (int i = 0; i < cols; i++) {
                    result.add(matrix[i1][i2++]);
                }
                break;
            }
            else if (cols == 1) {
                for (int i = 0; i < rows; i++) {
                    result.add(matrix[i1++][i2]);
                }
                break;
            }
            
            for (int i = 0; i < cols-1; i++) {
                result.add(matrix[i1][i2++]);
            }
            
            for (int i = 0; i < rows-1; i++) {
                result.add(matrix[i1++][i2]);
            }
            
            for (int i = 0; i < cols-1; i++) {
                result.add(matrix[i1][i2--]);
            }
            
            for (int i = 0; i < rows-1; i++) {
                result.add(matrix[i1--][i2]);
            }
            
            
            i1++;
            i2++;
            rows -= 2;
            cols -= 2;
        }
        
        return result;
    }
}