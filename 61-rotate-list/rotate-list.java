class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;
        int length = 1;
        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
            length++;
        }
        temp.next = head;
        k = k % length;
        int jump = length - k;

        while (jump-- > 0) { //jump = jump-1;
            temp = temp.next;
        }
        ListNode returnHead = temp.next;
        temp.next = null;

        return returnHead;
    }
}