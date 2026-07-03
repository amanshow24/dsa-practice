// 557. Reverse Words in a String III
class Solution {
    public String reverseWords(String s) {
        int n = s.length();

        int start = 0;
        for (int end = 0; end < n; end++) {
            if (s.charAt(end) == ' ') {
                s = reverse(s, start, end - 1);
                start = end + 1;
            }
        }
        s = reverse(s, start, n - 1);

        return s;
    }

    public static String reverse(String s, int start, int end) {
        StringBuilder sb = new StringBuilder(s);

        while (start < end) {
            char temp1 = s.charAt(start);
            char temp2 = s.charAt(end);

            sb.setCharAt(start, temp2);
            sb.setCharAt(end, temp1);

            start++;
            end--;
        }

        return sb.toString();
    }
}
