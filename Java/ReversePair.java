/* 
Given an integer array nums, return the number of reverse pairs in the array.
A reverse pair is a pair (i, j) where:
0 <= i < j < nums.length and
nums[i] > 2 * nums[j].
 
Example 1:
Input: nums = [1,3,2,3,1]
Output: 2
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1

Example 2:
Input: nums = [2,4,3,5,1]
Output: 3
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 4, nums[4] = 1, 4 > 2 * 1
(2, 4) --> nums[2] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 5, nums[4] = 1, 5 > 2 * 1
 

Constraints:
1 <= nums.length <= 5 * 104
-231 <= nums[i] <= 231 - 1

--->> Answer

public class ReversePair {
    
}

class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
    public int mergeSort(int nums[],int low,int high){
        int count = 0;
        if (low < high) {
            int mid = low + (high - low) / 2;
            count += mergeSort(nums, low, mid);
            count += mergeSort(nums, mid + 1, high);
            count += merge(nums, low, mid, high);
        }
        return count;
    }
    public int merge(int []nums, int low,int mid,int high){
        int[] leftArray = Arrays.copyOfRange(nums, low, mid + 1);
        int[] rightArray = Arrays.copyOfRange(nums, mid + 1, high + 1);
        int i = 0, j = 0, k = low;
        int count = 0;
        while (i < leftArray.length && j < rightArray.length) {
            if ((long) leftArray[i] > 2 * (long) rightArray[j]) {
                count += leftArray.length - i;
                j++;
            } else {
                i++;
            }
        }
        i = 0;
        j = 0;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                nums[k++] = leftArray[i++];
            } else {
                nums[k++] = rightArray[j++];
            }
        }
        while (i < leftArray.length) {
            nums[k++] = leftArray[i++];
        }
        while (j < rightArray.length) {
            nums[k++] = rightArray[j++];
        }
        return count;
    }
}
*/