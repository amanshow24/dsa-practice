// 905. Sort Array By Parity
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length ;
        int i = 0 , j = 0 ;

        while(j < n){
            if(nums[j] % 2 != 0) j++ ;
            else{
               swap(nums , i , j);
               i++ ;
               j++ ;
            }
        }

        return nums ;
    }
    public static void swap(int[] arr , int a , int b){
        int temp = arr[a] ;
        arr[a] = arr[b] ;
        arr[b] = temp ;
    }
}
