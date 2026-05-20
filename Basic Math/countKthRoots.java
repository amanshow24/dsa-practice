// L - 3932. Count K-th Roots in a Range
class Solution {
    public int countKthRoots(int l, int r, int k) {
        if(k == 1) return (r - l + 1) ;
        int count = 0 ;
        for(int i = 0 ; i <= r ; i++){
            long check = (long)Math.pow(i , k) ;
            
            if(check > r) break ;
            if(check >= l && check <= r) count++ ;
        }
        return count ;
    }
}
