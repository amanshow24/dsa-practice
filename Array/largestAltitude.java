// 1732. Find the highest Altitude
class Solution {
    public int largestAltitude(int[] gain) {
        int currentAlt = 0;
        int maxAlt = 0;
        for (int ele : gain) {
            currentAlt += ele;
            maxAlt = Math.max(maxAlt, currentAlt);
        }
        return maxAlt;
    }
}