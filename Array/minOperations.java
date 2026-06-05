// 1769. Minimum Number of Operations to Move All Balls to Each Box
class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                char ch = boxes.charAt(j);
                if (i == j)
                    continue;

                if (ch == '1') {
                    count += Math.abs(j - i);
                }
            }
            ans[i] = count;
        }

        return ans;
    }
}
