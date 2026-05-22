// L.2859. Sum of Values at Indices With K Set Bits

class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int len = nums.size() ;
        int sum = 0 ;

        for(int i = 0 ; i < len ; i++){
            int count = 0 ;
            int n = i ;
            while(n != 0){
                count++ ;
                n = n & (n - 1) ;
            }

            if(count == k) sum += nums.get(i) ;
        }

        return sum ;
    }
}
