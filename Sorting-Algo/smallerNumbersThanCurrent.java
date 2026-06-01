// 1365. How Many Numbers Are Smaller Than the Current Number
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq = new int[101] ;

        for(int ele : nums){
            freq[ele]++ ;
        }
        
        int n = nums.length ;
        int[] ans = new int[n] ;

        for(int i = 0 ; i < n ; i++){
            int count = 0 ;
            for(int j = 0 ; j < nums[i] ; j++){
               count += freq[j] ;
            }
            ans[i] = count ;
        }

        return ans ;
    }
}
