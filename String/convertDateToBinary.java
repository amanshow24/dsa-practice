// 3280. Convert Date to Binary
class Solution {
    public String convertDateToBinary(String date) {
        String y = date.substring(0, 4);
        String m = date.substring(5, 7);
        String d = date.substring(8);

        int year = Integer.parseInt(y);
        int month = Integer.parseInt(m);
        int day = Integer.parseInt(d);

        StringBuilder sb = new StringBuilder() ;
        sb.append(binary(year)) ;
        sb.append("-") ;
        sb.append(binary(month)) ;
        sb.append("-") ;
        sb.append(binary(day)) ;

        return sb.toString() ;
    }
    public static String binary (int n){
        String ans = "" ;
        while (n > 0){
           int rem = n % 2 ;
           ans = rem + ans ;
           n /= 2 ;
        }
        return ans ;
    }
}
