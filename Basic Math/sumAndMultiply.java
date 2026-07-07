// 3754. Concatenate Non-Zero Digits and Multiply by Sum I
class Solution {
    public long sumAndMultiply(int n) {
        long x = form(n);

        long ans = 0;
        if (x == 0)
            return ans;

        long orgx = x;
        long sum = 0;
        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }

        ans = orgx * sum;
        return ans;
    }

    public static long form(int n) {
        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            int digit = n % 10;
            if (digit != 0)
                sb.insert(0, digit);

            n /= 10;
        }

        if (sb.length() == 0) {
            return 0;
        }

        return Long.parseLong(sb.toString());
    }
}
