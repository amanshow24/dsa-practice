// 3978. Unique Middle Element
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n = nums.length ;
        int x = nums[n / 2] ;

        int count = 0 ;

        for(int ele : nums){
            if(ele == x) count++ ;
        }

        return count == 1 ;
    }
}
