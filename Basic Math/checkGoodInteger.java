// Check Good Integer
class Solution {
    public boolean checkGoodInteger(int n) {
        int sum = 0 ;
        int sqrsum = 0 ;
        
        while(n != 0){
            int digit = n %10 ;
            sum += digit ;
            sqrsum += digit * digit ;
            n /= 10 ;
        }

        return sqrsum - sum >= 50 ;
    }
}
