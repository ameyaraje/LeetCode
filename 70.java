/*
	Brute force solution: Recusrion
	Problem obviously is that time is exponential
*/
	public class Solution {
    public int climbStairs(int n) {
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;
        else
            return climbStairs(n-1) + climbStairs(n-2);
    }
}

/*
	Method 2: Memoization
	Essentially, there is a need to store the already calculated values somewhere. 
	Idea was to use a HashMap but CTCI has a neat trick of using an array 
	Space: O(n) 
*/
	public class Solution {
    public int climbStairs(int n) {
        int[] mem = new int[n+1];
        Arrays.fill(mem, -1);
        return climbStairs(n, mem);
    }
    
    public int climbStairs(int n, int[] mem) {
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;
        if (mem[n] > -1)
            return mem[n];
        else {
            mem[n] = climbStairs(n-1, mem) + climbStairs(n-2, mem);
            return mem[n];
        }
    }
}