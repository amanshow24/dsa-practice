// 3190. Find Minimum Operations to Make All Elements Divisible by Three
class Solution {
    public int minimumOperations(int[] nums) {
        int ans = 0 ;

        for(int ele : nums){
            if(ele % 3 != 0) ans++ ;
        }
        return ans ;
    }
}
