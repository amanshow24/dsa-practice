// 2486. Append character to a string to make subsequence 

class Solution {
    public int appendCharacters(String s, String t) {
        int lens = s.length();
        int lent = t.length();
        
        int i = 0 ;
        int j = 0 ;
        
        while(i < lens && j < lent){
            if(s.charAt(i) == t.charAt(j)){
                i++ ;
                j++ ;
            } else {
                i++ ;
            }
        }
        
        return lent - j ;
    }
}