// 167. Two Sum II - Input Array Is Sorted
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];

        int low = 0, high = n - 1;

        while (low < high) {
            if (nums[high] + nums[low] == target) {
                ans[0] = low + 1;
                ans[1] = high + 1;
                return ans ;
            } else if (nums[high] + nums[low] > target) {
                high--;
            } else
                low++;
        }

        return ans;
    }
}
