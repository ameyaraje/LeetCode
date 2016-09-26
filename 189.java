/*	shift elements one by one
	O(n*n)
*/

public class Solution() {
	public void rotate(int[] nums, int k) {
		int len = nums.length;
		for(int i = 0; i < k; i++) {
			rotateRight(nums, len);
		}
	}

	public void rotateRight(int[] arr, int len) {

	}
}


/*	method 2 (LeetCode)
	1. Reverse array
	2. Reverse 0 to (k-1)
	3. Reverse k to length
*/
public class Solution {
    public void rotate(int[] nums, int k) {
    k %= nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
}

public void reverse(int[] nums, int start, int end) {
    while (start < end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
}
}