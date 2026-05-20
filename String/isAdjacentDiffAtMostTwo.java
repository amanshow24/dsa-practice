// L - 3931. Check Adjacent Digit Differences
class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        int n = s.length() ;

        int maxDiff = 0 ;
        for(int i = 0 ; i < n - 1 ; i++){
            int first = s.charAt(i) - '0' ;
            int second = s.charAt(i + 1) - '0' ;

            int diff = Math.abs(first - second) ;
            maxDiff = Math.max(diff , maxDiff) ;
        }

        if(maxDiff <= 2) return true ;
        return false ;
    }
}
