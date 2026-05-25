// 1518. Water Bottles
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        int empty = numBottles;

        while (empty >= numExchange) {
            int newBottles = empty / numExchange;
            int rem = empty % numExchange;

            ans += newBottles;
            empty = newBottles + rem;
        }

        return ans;
    }
}
