// 3432. Count Partitions with Even Sum Difference -- prefix sum problem
class Solution {
    public int countPartitions(int[] nums) {
        int total = 0 ;

        for(int ele : nums){
            total += ele ;
        }

        if(total % 2 == 0) return nums.length - 1 ;
        return 0 ;
    }
}
