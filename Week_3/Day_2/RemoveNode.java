// package Week_3.Day_2;

public class RemoveNode {
     public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode pre = slow;

        for(int i=1;i<=n;i++)
        {
            fast = fast.next;
        }
        if(fast == null) return head.next;
        while(fast!=null)
        {
            pre = slow;
            slow = slow.next;
            fast = fast.next;
        }
        pre.next = slow.next;

        return head;

    }
}
