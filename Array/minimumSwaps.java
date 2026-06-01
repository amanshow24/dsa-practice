// 3936. Minimum Swaps to Move Zeros to End
class Solution {
    public int minimumSwaps(int[] nums) {
        int n = nums.length;
        int countOne = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[i] = 1;
                countOne++;
            }
        }

        int ans = 0; // which 1 are in Zero's place

        for (int i = n - 1; i >= countOne; i--) {
            if (nums[i] == 1)
                ans++;
        }

        return ans;
    }
}
