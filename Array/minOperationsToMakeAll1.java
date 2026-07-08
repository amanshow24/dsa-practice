// 3191. Minimum Operations to Make Binary Array Elements Equal to One I
class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int ans = 0;

        if (nums[0] == 0) {
            nums[0] = 1;
            if (nums[1] == 0)
                nums[1] = 1;
            else
                nums[1] = 0;

            if (nums[2] == 0)
                nums[2] = 1;
            else
                nums[2] = 0;

            ans++;
        }

        for (int i = 1; i < n - 2; i++) {
            if (nums[i] == 0) {
                nums[i] = 1;
                if (nums[i + 1] == 0)
                    nums[i + 1] = 1;
                else
                    nums[i + 1] = 0;

                if (nums[i + 2] == 0)
                    nums[i + 2] = 1;
                else
                    nums[i + 2] = 0;

                ans++;
            }
        }

        for(int ele : nums){
            if(ele == 0) return -1 ;
        }

        return ans ;
    }
}
