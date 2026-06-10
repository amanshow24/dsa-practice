// 1689. Partitioning Into Minimum Number Of Deci-Binary Numbers
class Solution {
    public int minPartitions(String n) {
        int maxDigit = 0;

        for (int i = 0; i < n.length(); i++) {
            int currentDigit = n.charAt(i) - '0';

            maxDigit = Math.max(maxDigit, currentDigit);

            if (maxDigit == 9)
                break;
        }
        return maxDigit;
    }
}
