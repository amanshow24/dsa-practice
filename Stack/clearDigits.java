// 3174. Clear Digits
class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>() ;
        StringBuilder sb = new StringBuilder() ;

        for(char ch : s.toCharArray()){
           if(ch >= 'a' && ch <= 'z') st.push(ch) ;
           else st.pop() ;
        }

        while(st.size() > 0){
            sb.append(st.pop()) ;
        }
        return sb.reverse().toString() ;
    }
}
