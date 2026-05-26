// 168. Excel Sheet Column Title
class Solution {
    public String convertToTitle(int colNum) {
        StringBuilder sb = new StringBuilder() ;

        while(colNum > 0){
            colNum-- ;

            int rem = colNum % 26 ;
            char ch = (char) (rem + 'A') ;
            sb.append(ch) ;

            colNum /= 26 ;
        }
        return sb.reverse().toString() ;
    }
}
