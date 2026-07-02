// 3794. Reverse String Prefix
class Solution {
    public String reversePrefix(String s, int k) {
        k = k - 1 ;
        StringBuilder sb = new StringBuilder(s);

        int i = 0 ;
        while (i < k) {
            char temp1 = sb.charAt(i);
            char temp2 = sb.charAt(k);

            sb.setCharAt(i, temp2);
            sb.setCharAt(k, temp1);

            i++;
            k--;
        }

        return sb.toString() ;
    }
}
