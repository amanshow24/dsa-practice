// 3760. Maximum Substrings With Distinct Start
class Solution {
    public int maxDistinct(String s) {
        int n = s.length();
        int[] freq = new int[26];

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int ascaii = ch - 'a';
            freq[ascaii]++;
        }
        
        int distinctCount = 0 ;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0)
                distinctCount++;
        }

        return distinctCount ;
    }
}
