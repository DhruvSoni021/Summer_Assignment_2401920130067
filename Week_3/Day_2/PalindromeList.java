// package Week_3.Day_2;

public class PalindromeList {
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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null) 
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;

        head2 = reverseList(head2);

        ListNode i = head;
        ListNode j = head2;

        while(j!=null)
        {
            if(i.val != j.val) return false;
            i = i.next;
            j = j.next;
        }
        return true;
    }
}
