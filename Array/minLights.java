// 3964. Minimum Lights to Illuminate a Road
class Solution {
    public int minLights(int[] lights) {
        int n = lights.length;
        int[] diff = new int[n + 1];

        for (int i = 0; i < n; i++) {
            int v = lights[i];
            if (v == 0)
                continue;

            int firstRange = Math.max(0, i - v);
            int lastRange = Math.min(n - 1, i + v);

            diff[firstRange]++;
            diff[lastRange + 1]--;
        }
        boolean[] visible = new boolean[n];

        int curr = 0;
        for (int i = 0; i < n; i++) {
            curr += diff[i];

            if (curr > 0) {
                visible[i] = true;
            }
        }

        int minNum = 0;
        int i = 0;

        while (i < n) {
            if (visible[i]) {
                i++;
                continue;
            }
            int len = 0;

            while (i < n && !visible[i]) {
                len++;
                i++;
            }

            minNum += (len + 2) / 3; // take ceil value
        }

        return minNum;
    }
}
