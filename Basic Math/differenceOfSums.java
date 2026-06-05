// 2894. Divisible and Non-divisible Sums Difference
class Solution {
    public int differenceOfSums(int n, int m) {
        int sumNotDivisable = 0;
        int sumDivisable = 0;

        for (int i = 1; i <= n; i++) {
            if (i % m == 0)
                sumDivisable += i;
            else
                sumNotDivisable += i;
        }

        return sumNotDivisable - sumDivisable;
    }
}
