import java.util.HashMap;

public class Two_Sum {
    // Two Sum Function
    static int[] twoSum(int[] nums, int target) {
    // Create an HashMap
    HashMap<Integer, Integer> map = new HashMap<>();

    // Loop through nums length
        for(int i=0; i<nums.length; i++) {
            // add all the elements in hashMap
            map.put(nums[i], i);
        }

        // Loop through nums length
        for(int i=0; i<nums.length; i++) {
            // Store the first element in a variable
            int number = nums[i];
            // find remainder (target - number)
            int remainder = target - number;
            // If hashMap contains element
            if(map.containsKey(remainder)) {
            // Find second element index
            int index = map.get(remainder);
            // Find duplicate elements
            // Don't pick the same element (2,2)
            if(index == i){
                 continue;
            }
            // return indices
            return new int[] {i, index};
            }
        }
        return new int[]{};
    }
}

// Output -
/*
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
  */

// Algorithm -
/*
1. Create an HashMap
2. Loop through nums length & add all the elements in hashMap
3. Store the first element in a variable (number)
4. Find remainder (target - number)
5. If hashMap contains element return element
  */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(n) because we using HashMap
  */