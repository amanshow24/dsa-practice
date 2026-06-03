// 2. Add Two Numbers
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        while (l1 != null) {
            sb1.insert(0, l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            sb2.insert(0, l2.val);
            l2 = l2.next;
        }
        java.math.BigInteger a = new java.math.BigInteger(sb1.toString());
        java.math.BigInteger b = new java.math.BigInteger(sb2.toString());

        String s = a.add(b).toString();

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            int digit = ch - '0';

            curr.next = new ListNode(digit);
            curr = curr.next;
        }
        return dummy.next;
    }
}
