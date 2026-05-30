// 1475. Final Prices With a Special Discount in a Shop
class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack<>() ;
        int n = prices.length ;
        int[] ans = new int[n] ;
        
        ans[n - 1] = prices[n - 1] ;
        st.push(prices[n - 1]) ;

        for(int i = n - 2 ; i >= 0 ; i--){
            while(st.size() > 0 && st.peek() > prices[i]) st.pop() ;

            if(st.size() > 0) ans[i] = prices[i] - st.peek() ;
            else ans[i] = prices[i] ;

            st.push(prices[i]) ;
        }

        return ans ;
    }
}
