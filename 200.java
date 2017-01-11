/*
	Done using DFS. Need to check again why this isnt working
*/
	public class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int ROWS = grid.length;
        int COLS = grid[0].length;
        boolean[][] visited = new boolean[ROWS][COLS];
        
        System.out.println("Rows, Cols" + ROWS + " " + COLS);
        
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    DFS(grid, i, j, visited);
                    ++count;
                }
            }
        }
        return count;
    }
    
    public void DFS(char[][] grid, int row, int col, boolean[][] visited) {
        int[] rowNumber = {-1, -1, 1, 0, 0, 1, 1, 1};
        int[] colNumber = {-1, 0, 1, -1, 1, -1, 0, 1};
        
        visited[row][col] = true;
        
        for (int k = 0; k < 8; k++) {
            if (isSafe(grid, row + rowNumber[k], col + colNumber[k], visited))
                DFS(grid, row + rowNumber[k], col + colNumber[k], visited);
        }
    }
    
    public boolean isSafe(char[][] grid, int row, int col, boolean[][] visited) {
        return (row >= 0) && (col >=0) && (grid[row][col] == 1 && !visited[row][col]);
    }
}

/*
	DFS again. 
*/
	public class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0||grid[0].length == 0)
            return 0;
     
        int ROWS = grid.length;
        int COLS = grid[0].length;
     
        int count = 0;
        
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    doDFS(grid, i, j);
                }
            }
        }
     
        return count;
    }
     
    public void doDFS(char[][] grid, int row, int col){
        int ROWS = grid.length;
        int COLS = grid[0].length;
     
        if (row < 0 || row >= ROWS || col < 0 || col >= COLS || grid[row][col] != '1')
            return;
     
        grid[row][col]='V';
     
        doDFS(grid, row-1, col);
        doDFS(grid, row+1, col);
        doDFS(grid, row, col-1);
        doDFS(grid, row, col+1);
    }
}