// 1704. Determine if String Halves Are Alike
class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int n = s.length();
        int i = 0, j = n / 2;
        int firstHalf = 0, lastHalf = 0;

        while (i < j && j < n) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);

            if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u')
                firstHalf++;
            if (ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u')
                lastHalf++;

            i++;
            j++;
        }

        if (firstHalf == lastHalf)
            return true;
        return false;
    }
}
