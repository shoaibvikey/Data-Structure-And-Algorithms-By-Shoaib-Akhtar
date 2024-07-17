/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.You must solve the problem without modifying the array nums and uses only constant extra space.

 

Example 1:
Input: nums = [1,3,4,2,2]
Output: 2

Example 2:
Input: nums = [3,1,3,4,2]
Output: 3

Example 3:
Input: nums = [3,3,3,3,3]
Output: 3
 

Constraints:
1 <= n <= 105
nums.length == n + 1
1 <= nums[i] <= n
All the integers in nums appear only once except for precisely one integer which appears two or more times.
 

Follow up:
How can we prove that at least one duplicate number must exist in nums?
Can you solve the problem in linear runtime complexity?
 */


// --->> Explanation

// Time Complexity:- O(n2) AND Space Complexity:-O(1)
        /*
         * for(int i=0; i<nums.length; i++){
         * int count=0;
         * for(int j=i+1; j<nums.length; j++){
         * if(nums[i]==nums[j]){
         * return nums[i];
         * }
         * }
         * }
         * return nums.length;
         */

          // Time Complexity:- O(n) AND Space Complexity:- O(1)
        // HashSet<Integer> set = new HashSet<>();
        // for (int i = 0; i < nums.length; i++) {
        //     if (!set.add(nums[i])) {
        //         return nums[i];
        //     }
        // }
        // return nums.length;

                // using Floyd's Algorithm
        // Time Complexity:- O(n) AND Space Complexity:- O(1)
        // int slow = nums[0];
        // int fast = nums[0];
        // do{
        //     slow = nums[slow];
        //     fast = nums[nums[fast]];
        // } while(slow != fast);

        // fast = nums[0];
        // while(slow != fast){
        //     slow = nums[slow];
        //     fast = nums[fast];
        // }
        // return slow;




        // Array Solution
        // Time Complexity:- O(n) AND Space Complexity:- O(n)




public class FindTheDuplicateNumber {
    
}
class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] bool = new boolean[nums.length];
        for(int num:nums){
            if(bool[num]){
                return num;
            }
            bool[num] = true;
        }
        return 0;
    }
}