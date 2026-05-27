// 3918. Sum of Primes Between Number and Its Reverse
class Solution {
    public int sumOfPrimesInRange(int n) {
        int org = n;
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }

        int ans = 0;
        int start = Math.min(org, rev);
        int end = Math.max(org, rev);

        for (int i = start; i <= end; i++) {
            if (prime(i))
                ans += i;
        }

        return ans;
    }

    public static boolean prime(int x) {
        if (x <= 1)
            return false;

        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }
}
