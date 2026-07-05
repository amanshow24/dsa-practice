// Sum of Integers with Maximum Digit Range
class Solution {
    public int maxDigitRange(int[] nums) {
        int ans = 0 ;
        int[] freq = new int[100] ;

        int maxdit = 0 ;
        for(int i = 0 ;i < nums.length ; i++){
            int x = digit(nums[i]) ;
            maxdit = Math.max (maxdit , x) ;
            freq[i] = x ;
        }

        for(int i = 0 ; i < nums.length ; i++){
            if(freq[i] == maxdit) ans += nums[i] ;
        }

        return ans ;
    }
    public static int digit (int n){
        int max = 0 ;
        int min = 9 ;

        while(n != 0){
            int digit = n % 10 ;
            max = Math.max(max , digit) ;
            min = Math.min(min , digit) ;

            n /= 10 ;
        }

        return max - min ;
    }
}
