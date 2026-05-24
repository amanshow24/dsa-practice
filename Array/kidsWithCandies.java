// 1431. Kids with the greatest number of candies
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extra) {
        ArrayList<Boolean> ans = new ArrayList<>() ;
        
        int large = 0 ;
        int n = candies.length ;
        
        for(int i = 0 ; i < n ; i++){
            if (large < candies[i]) large = candies[i];
        }
        
        for(int i = 0 ; i < n ; i++){
            if(candies[i] + extra >= large) ans.add(true) ;
            else ans.add(false) ;
        }
        
        return ans ;
    }
}