public class Find_the_Winner_of_the_Circular_Game {
    // Find the Winner of the Circular Game Function
    public int findTheWinner(int n, int k) {
        // Base Case
        if (n == 1) {
            return 1;
        }

        // Recursive Case
        /* The position returned by josephus(n - 1, k)
        is adjusted because the recursive call
        josephus(n - 1, k) considers the original
        position k%n + 1 as position 1 */
        return (findTheWinner(n - 1, k) + k - 1 ) % n + 1;
    }
}

// Note -
/*
josephus(n, k) = (josephus(n - 1, k) + k-1) % n + 1
josephus(1, k) = 1
*/

// Output -
/*
Input: n = 5, k = 2
Output: 3
Explanation: Here are the steps of the game:
1) Start at friend 1.
2) Count 2 friends clockwise, which are friends 1 and 2.
3) Friend 2 leaves the circle. Next start is friend 3.
4) Count 2 friends clockwise, which are friends 3 and 4.
5) Friend 4 leaves the circle. Next start is friend 5.
6) Count 2 friends clockwise, which are friends 5 and 1.
7) Friend 1 leaves the circle. Next start is friend 3.
8) Count 2 friends clockwise, which are friends 3 and 5.
9) Friend 5 leaves the circle. Only friend 3 is left, so they are the winner.
*/

// Algorithm -
/*
1. Find Base Case
2. Recursive Case, /* The position returned by josephus(n - 1, k)
is adjusted because the recursive call josephus(n - 1, k) considers the original
position k%n + 1 as position 1
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(n)
*/
