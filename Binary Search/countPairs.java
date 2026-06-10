// 2824. Count Pairs Whose Sum is Less than Target
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums) ;
        int n = nums.size() ;

        int left = 0 , right = n - 1 ;
        int ans = 0 ;

        while(left < right){
           if(nums.get(left) + nums.get(right) < target){
                ans += right - left ;
                left++ ;
           }
           else right-- ;
        }
        return ans ;
    }
}
