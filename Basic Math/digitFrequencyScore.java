// Digit Frequency Score

class Solution {
    public int digitFrequencyScore(int n) {
        int[] freq = new int[10] ;

        int org = n ;
        int temp = n ;
        
        while(n != 0){
            int digit = n % 10 ;
            freq[digit]++ ;

            n /= 10 ;
        }

        int ans = 0 ;
        while(temp != 0){
            int digit = temp % 10 ;

            ans += digit * freq[digit] ;
            freq[digit] = 0 ;

            temp /= 10 ;
        }

        return ans ;
    }
}
