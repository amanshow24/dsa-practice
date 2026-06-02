// 3074. Apple Redistribution into Boxes
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int m = capacity.length;
        int sum = 0;
        for (int ele : apple) {
            sum += ele;
        }

        Arrays.sort(capacity);

        int x = 0;
        int count = 0 ;

        for (int i = m - 1 ; i >= 0 ; i--) {
            x += capacity[i];
            count++ ;
            if (x >= sum) {
                return count ;
            }
        }
        return -1;
    }
}
