// 3895. Count Digit Appearances
class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int n = nums.length ;
        int ans = 0 ;

        for(int i = 0 ; i < n ; i++){
            int number = nums[i] ;
            ans = ans + appear(number , digit) ;
        }
        return ans ;
    }

    public static int appear(int n , int target){
        int count = 0 ;
        while(n != 0){
           if(n % 10 == target)count++ ;
           n /= 10 ;
        }
        return count ;
    }
}
