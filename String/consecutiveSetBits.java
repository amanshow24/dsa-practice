// 3950. Exactly One Consecutive Set Bits Pair
class Solution {
    public boolean consecutiveSetBits(int n) {
        String s = binaryNum(n) ;

        int len = s.length() ;

        int count = 0 ;
        
        for(int i = 1 ; i < len ; i++){
            char ch = s.charAt(i) ;
            char prev = s.charAt(i - 1) ;

            if(ch == '1' && prev == ch){
                 count++ ;
            }
        }

        return count == 1 ;
    }
    public static String binaryNum (int n){
        String binary = "" ;

        while(n != 0){
            int rem = n % 2 ;
            binary = rem + binary ;
            n /= 2 ;
        }
        return binary ;
    }
}
