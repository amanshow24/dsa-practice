// 3798. Largest Even Number
class Solution {
    public String largestEven(String s) {
        StringBuilder sb = new StringBuilder() ;

        for(int i = s.length() - 1 ; i >= 0  ; i--){
           if(s.charAt(i) == '2'){
              for(int j = i ; j >= 0 ; j--){
                sb.append(s.charAt(j)) ;
              }
              break ;
           }
           else continue ;
        }
        
        String result = sb.reverse().toString() ;
        return result ;
    }
}
