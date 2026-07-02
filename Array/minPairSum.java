// 1877. Minimize Maximum Pair Sum in Array
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums) ;

        int n = nums.length ;
        
        int ans = 0 ;
        int left = 0 , right = n - 1 ;

        while(left < right){
            ans = Math.max(ans , nums[left] + nums[right]) ;
            left++ ;
            right-- ;
        }

        return ans ;
    }
}
