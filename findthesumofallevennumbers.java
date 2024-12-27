/*
    Time Complexity : O(N)
    Space Complexity : O(1)

    Where N is the given integer.
*/

public class Solution {
	public static long evenSumTillN(int n) {

        // To store the sum.
		long sum = 0;

        // Starting number.
		int i = 2;

		while (i <= n) {
			sum += i;
			i += 2;
		}

		return sum;
	}
}