// 1189. Maximum Number of Balloons
class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26] ;
        
        int len = text.length() ;
        
        for(int i = 0 ; i < len ; i++){
            char ch = text.charAt(i) ;
            int idx = ch - 'a' ;
            
            freq[idx]++ ;
        }
        
        int b = freq['b' - 'a'] ;
        int a = freq['a' - 'a'] ;
        int l = freq['l'-'a'] / 2 ;
        int o = freq['o'-'a'] / 2 ;
        int n = freq['n' - 'a'] ;
        
        int result = Math.min(b , Math.min(a , Math.min(l , Math.min(o , n)))) ;
        
        return result ;
    }
}