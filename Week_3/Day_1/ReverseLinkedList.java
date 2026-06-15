// package Week_3.Day_1;

public class ReverseLinkedList {
     public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode curr = head;
        ListNode pre = null;
        ListNode fwd = null;

        while(curr!=null)
        {
            fwd = curr.next;
            curr.next = pre;
            pre = curr;
            curr = fwd;
        }
        return pre;
    }
}
