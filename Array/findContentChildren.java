// 455. Assign Cookies
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length ;
        int m = s.length ;

        if(m == 0) return 0 ;
        // sort the both arrays
        Arrays.sort(g) ;
        Arrays.sort(s) ;
        
        int ans = 0 ;
        int i = 0 , j = 0 ;

        while(i < n & j < m){
            if(g[i] <= s[j]){
                ans++ ;
                i++ ;
                j++ ;
            } else j++ ;
        }
        return ans ;
    }
}
