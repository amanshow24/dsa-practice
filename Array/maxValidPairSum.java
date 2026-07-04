// 3979. Maximum Valid Pair Sum
class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n = nums.length ;

        int ans = 0 ;
        int currMax = nums[0] ;
        
        for(int j = k ; j < n ; j++){
            currMax = Math.max(currMax , nums[j - k]) ;

            ans = Math.max(ans , currMax + nums[j]) ;
        }

        return ans ;
    }
}
