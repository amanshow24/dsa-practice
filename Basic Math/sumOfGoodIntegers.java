// 3954. Sum of Compatible Numbers in Range I
class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int sum = 0;

        for (int i = 1; i <= n + k; i++) {
            int diff = Math.abs(n - i);
            int z = (n & i);

            if (diff <= k && z == 0)
                sum += i;
        }

        return sum;
    }
}
