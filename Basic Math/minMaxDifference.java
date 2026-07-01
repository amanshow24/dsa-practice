// 2566. Maximum Difference by Remapping a Digit
class Solution {
    public int minMaxDifference(int num) {
        String numstr = String.valueOf(num);

        char maxTarget = '9';

        // find value from left which is not 9 -- to find max value
        for (int i = 0; i < numstr.length(); i++) {
            char ch = numstr.charAt(i);

            if (ch != '9') {
                maxTarget = ch;
                break;
            }
        }

        // to find min value 
        char minTarget = numstr.charAt(0);

        String maxStr = numstr.replace(maxTarget, '9');
        String minStr = numstr.replace(minTarget, '0');

        return Integer.parseInt(maxStr) - Integer.parseInt(minStr);
    }
}
