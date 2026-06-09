// 2390. Removing Stars From a String
class Solution {
    public String removeStars(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (st.size() > 0 && ch == '*')
                st.pop();
            else
                st.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        while (st.size() > 0) {
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}
