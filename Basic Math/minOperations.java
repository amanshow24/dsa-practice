// 3512. Minimum Operations to Make Array Sum Divisible by K
class Solution {
    public int minOperations(int[] nums, int k) {
        int totalSum = 0 ;
        for(int ele : nums){
            totalSum += ele ;
        }

        return totalSum % k ;
    }
}
