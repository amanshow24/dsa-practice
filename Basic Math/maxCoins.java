// 1561. Maximum Number of Coins You Can Get
class Solution {
    public int maxCoins(int[] piles) {
        int n = piles.length ;
        Arrays.sort(piles) ;

        int ans = 0 ;
        int j = n - 1 ;

        for(int i = 0 ; i < n / 3 ; i++){
            ans += piles[j - 1] ;  // for me

            j -= 2 ;
        }
        return ans ;
    }
}
