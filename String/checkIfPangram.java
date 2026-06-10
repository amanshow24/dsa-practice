// 1832. Check if the Sentence Is Pangram
class Solution {
    public boolean checkIfPangram(String sentence) {
        int n = sentence.length();
        int[] freq = new int[26];

        for (int i = 0; i < n; i++) {
            char ch = sentence.charAt(i);
            int ascaii = ch - 'a';
            freq[ascaii]++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0)
                return false;
        }
        return true;
    }
}
