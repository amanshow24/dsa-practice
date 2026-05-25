// 4. Median of Two Sorted Arrays
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length ;
        int m = nums2.length ;

        int[] ans = new int[n + m] ;

        int i = 0 , j = 0 , k = 0 ;

        while(i < n && j < m){
           if(nums1[i] <= nums2[j]){
             ans[k++] = nums1[i++] ;
           } else {
             ans[k++] = nums2[j++] ;
           }
        }

        while(i < n){
            ans[k++] = nums1[i++] ;
        }
        while(j < m){
            ans[k++] = nums2[j++] ;
        }

        int newArrSize = n + m ;
        if(newArrSize % 2 == 1) return (double)ans[newArrSize / 2] ;
        else return (double) (ans[newArrSize / 2] + ans[newArrSize / 2 - 1]) / 2 ;
    }
}
