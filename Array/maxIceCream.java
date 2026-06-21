// 1833. Maximum Ice Cream Bars
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs) ;
        int count = 0 ;
        
        for(int ele : costs){
            if(coins < ele) break ;
            
            coins -= ele ;
            count++ ;
        }
        
        return count ;
    }
}