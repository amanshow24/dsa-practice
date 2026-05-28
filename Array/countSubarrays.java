// 3392. Count Subarrays of Length Three With a Condition
class Solution {
    public int countSubarrays(int[] nums) {
        int n = nums.length ;
        int ans = 0 ;

        for(int i = 1 ; i < n - 1 ; i++){
            // avoid '/' for integer truncation error
            if(nums[i] == (nums[i - 1] + nums[i + 1]) * 2) ans++ ;  
        }
        return ans ;
    }
}
