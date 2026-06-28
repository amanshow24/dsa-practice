// 3289. The Two Sneaky Numbers of Digitville
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans = new int[2];
        int[] freq = new int[102];

        for (int ele : nums) {
            freq[ele]++;
        }
        int pointer = 0;
        for (int i = 0; i < 102; i++) {
            if (freq[i] > 1)
                ans[pointer++] = i;
        }
        return ans;
    }
}
