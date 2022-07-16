import java.util.Arrays;

public class Count_Primes {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        // Create a boolean array "prime[0..n]" and
        // initialize all entries it as true. A value in
        // prime[i] will finally be false if i is Not a
        // prime, else true.
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // Loop through length -1
        // or for (int i = 2; i <= Math.sqrt(n - 1); i++) {
        for (int i = 2; i <= n-1; i++) {
            // If isPrime[i] is not changed, then it is a prime
            if (isPrime[i] == true) {
                // Update all the values of j=i^2 (multiply of i by 2) to false,
                // & update the j by j + 1
                for (int j = 2*i; j < n; j=j+i) {
                    isPrime[j] = false;
                }
            }
        }

        // Count all prime numbers
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }

        }
        return count;
    }
}

// Note -
/* Prime numbers are natural numbers that are divisible by only 1
   and the number itself. */

// Output -
/*
Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
*/

// Algorithm -
/*
1. Create a boolean array of size n
2. Fill all the values of boolean array to true
3. Loop through length -1, Check, If isPrime[i] is not changed,
   then it is a prime
4. Update all the values of j=i^2 (multiply of i by 2) to false,
   & update the j by j + 1
5. Count all prime numbers
*/

// Time & Space Complexity -
/*
Time - O(n*log(log(n)))
Space - O(n)
*/