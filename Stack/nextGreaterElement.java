// 496. Next Greater Element I
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int n = nums2.length;

        int[] arr = new int[n];
        arr[n - 1] = -1;
        st.push(nums2[n - 1]);

        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && st.peek() <= nums2[i])
                st.pop();

            if (st.size() > 0)
                arr[i] = st.peek();
            else
                arr[i] = -1;

            st.push(nums2[i]);
        }

        int[] freq = new int[10001];

        for (int i = 0; i < n; i++) {
            freq[nums2[i]] = arr[i];
        }

        int m = nums1.length;
        int[] ans = new int[m];

        for (int i = 0; i < m; i++) {
            ans[i] = freq[nums1[i]];
        }

        return ans;
    }
}
