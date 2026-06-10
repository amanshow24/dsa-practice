// 3211. Generate Binary Strings Without Adjacent Zeros
class Solution {
    List<String> ans = new ArrayList<>();

    public List<String> validStrings(int n) {
        solve(n, "", 0, '1');
        return ans;
    }

    public void solve(int n, String s, int len, char prev) {
        // base
        if (len == n) {
            ans.add(s);
            return;
        }

        // add 0
        if (prev == '1') {
            solve(n, s + "0", len + 1, '0');
        }

        // add 1
        solve(n, s + "1", len + 1, '1');

    }
}
