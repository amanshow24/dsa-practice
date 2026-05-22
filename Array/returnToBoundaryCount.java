// 3028. Ant on the Boundary
class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int n  = nums.length ;
        int[] ans = new int[n] ;
        
        ans[0] = nums[0] ;
        for(int i = 1 ; i < n ; i++){
           ans[i] = ans[i - 1] + nums[i] ;
        }

        int count = 0 ;
        for(int ele : ans){
            if(ele == 0) count++ ;
        }
        return count ;
    }
}
