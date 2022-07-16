public class Count_Trailing_Zeroes {
    // Count Trailing Zeroes Function
    public int trailingZeroes(int n) {
        // Negative Number Edge Case
        if(n < 0) {
            return -1;
        }
        // Initialize result
        int res = 0;

        // Keep dividing n by powers
        // of 5 and update count
        for(int i=5; i<=n; i=i*5) {
            res = res + n/i;
        }
        // Finally Return res
        return res;
    }
}

// Trailing 0s in n! = Count of 5s in prime factors of n!
//                  = floor(n/5) + floor(n/25) + floor(n/125) + ....

// Output -
/*
Input: n = 3
Output: 0
Explanation: 3! = 6, no trailing zero.
*/

// Algorithm -
/*
1. Initialize result to 0
2. Keep dividing n by powers of 5 and update res
3. Finally Return res
*/

// Time & Space Complexity -
/*
Time - O(log5n)
Space - O(1)
*/
