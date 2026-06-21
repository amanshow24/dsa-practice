// Valid Subarrays With Matching Sum Digits I
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int n = nums.length ;
        int org = x ;
        char target = (char) ('0' + x) ;
        
        int count = 0 ;
        
        for(int i = 0 ; i < n ; i++){
            long sum = 0 ;
            for(int j = i ; j < n ; j++){
                sum += nums[j] ;

                String s = String.valueOf(sum) ;
                if(s.charAt(0) == target && s.charAt(s.length() - 1) == target) count++ ;
            }
        }

        return count ;
    }
}
