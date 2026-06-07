// 3955. Valid Binary Strings With Cost Limit
class Solution {
    List<String> ans = new ArrayList<>();

    public List<String> generateValidStrings(int n, int k) {

        solve(0, n, k, 0, "", '0');
        return ans;
    }

    public void solve(int idx, int n, int k, int cost, String s, char prev) {

        if (cost > k)
            return;
        if (idx == n) {
            ans.add(s);
            return;
        }

        // add '0'
        solve(idx + 1, n, k, cost, s + "0", '0');

        // add '1'
        if (prev != '1') {
            solve(idx + 1, n, k, cost + idx, s + "1", '1');
        }
    }
}
