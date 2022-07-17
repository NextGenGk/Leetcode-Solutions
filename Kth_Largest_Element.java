import java.util.Collections;
import java.util.PriorityQueue;

// Kth Largest Element Class
public class Kth_Largest_Element {
    // Function to find k largest array element
    public int findKthLargest(int[] nums, int k) {
        // Implementation using a Priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        // Loop through all elements of nums
        for (int i = 0; i < nums.length; i++) {

            // Insert elements into
            // the priority queue
            pq.add(nums[i]);

            // If size of the priority
            // queue exceeds k
            if (pq.size() > k) {
                pq.poll();
            }
        }
        // finally return top element
        return pq.peek();
    }
}

// Idea -
/*
Find Largest Element then use (Min Heap) [In Java By Default Min Heap]
Find Smallest Element then use (Max Heap) [Use Comparator - Collections.reverseOrder()]
 */

// Output -
/*
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
*/

// Algorithm -
/*
1. Create a Min Heap (Priority Queue)
2. Loop through to length of the array
3. And add current element
4. Checks, If size of the priority queue exceeds k, than remove (Min Heap) topmost element
5. Finally return (Min Heap) topmost element
 */

// Time & Space Complexity -
/*
Time - O(n*log(k))
Space - O(k)
 */
