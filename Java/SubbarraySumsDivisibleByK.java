/* 
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length, prefSum = 0, ans = 0;
        Map<Integer, Integer> prevOcc = new HashMap<>();
        prevOcc.put(0, 1);
        for (int i = 0; i < n; i++) {
            prefSum = (prefSum + nums[i] % k + k) % k;
            ans += prevOcc.getOrDefault(prefSum, 0);
            prevOcc.put(prefSum, prevOcc.getOrDefault(prefSum, 0) + 1);
        }
        return ans;
    }
}
    */