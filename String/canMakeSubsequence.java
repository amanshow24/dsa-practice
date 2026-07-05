// Subsequence After One Replacement
class Solution {
    public boolean canMakeSubsequence(String s, String t) {
        int n = s.length() ;
        int m = t.length() ;

        if(n > m) return false ;

        int[] pre = new int[n + 1] ;
        int[] suf = new int[n + 1] ;

        pre[0] = -1 ;
        int j = 0 ;
        
        for(int i = 0 ; i < n ; i++){
            while(j < m && s.charAt(i) != t.charAt(j)) j++ ;

            if(j == m) pre[i + 1] = m ;
            else pre[i + 1] = j++ ;
        }

        if(pre[n] != m) return true ;
        
        suf[n] = m ;
        j = m - 1 ;

        for(int i = n - 1 ; i >= 0 ; i--){
            while(j >= 0 && s.charAt(i) != t.charAt(j)) j-- ;

            if(j < 0) suf[i] = -1 ;
            else suf[i] = j-- ;
        }

        for(int i = 0 ; i < n ; i++){
            if(pre[i] + 1 < suf[i + 1]) return true ;
        }

        return false ;
    }
}
