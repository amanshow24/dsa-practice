// 3498. Reverse Degree of a String
class Solution {
    public int reverseDegree(String s) {
        int n = s.length();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int idxReverse = 27 - (ch - 96);

            ans += idxReverse * (i + 1);
        }

        return ans;
    }
}
