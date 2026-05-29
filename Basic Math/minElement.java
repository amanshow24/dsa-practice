// 3300. Minimum Element After Replacement With Digit Sum
class Solution {
    public int minElement(int[] nums) {
        int n = nums.length ;
        for(int i = 0 ; i < n ; i++){
            nums[i] = digitSum(nums[i]) ;
        }

        int ans = nums[0] ;
        for(int i = 0 ; i < n ; i++){
            if(ans > nums[i]) ans = nums[i] ;
        }

        return ans ;
    }
    public static int digitSum (int n){
        int sum = 0 ;
        while(n != 0){
            int digit = n % 10 ;
            sum += digit ;
            n /= 10 ;
        }
        return sum ;
    }
}
