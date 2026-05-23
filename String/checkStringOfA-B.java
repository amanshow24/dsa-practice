// 2124. Check if All A's Appears Before All B's
class Solution {
    public boolean checkString(String s) {
        int n = s.length() ;
        
        boolean isAppearB = false ;
        for(int i = 0 ; i < n ; i++){
           if(s.charAt(i) == 'b'){
            isAppearB = true ;
           }
           else if(isAppearB) return false ;
        }

        return true ;
    }
}
