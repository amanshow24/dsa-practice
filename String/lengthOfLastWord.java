// 58. Length of Last Word
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim().replaceAll("\\s+", " ");

        char[] ch = s.toCharArray();

        int ans = 0;
        for (int i = ch.length - 1; i >= 0; i--) {
            if (ch[i] == ' ')
                return ans;

            ans++;
        }
        return ans;
    }
}
