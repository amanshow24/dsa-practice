// 171. Excel Sheet Column Number
class Solution {
    public int titleToNumber(String title) {
        int ans = 0 ;
        int n = title.length() ;
        int count = 1 ;

        for(int i = n - 1 ; i >= 0 ; i--){
            char ch = title.charAt(i) ;
            int index = ch - 64 ;

            ans += index * count ;
            count *= 26 ; 
        }
        return ans ;
    }
}
