// package Week_3.Day_2;
class ListNode {
   int val;
   ListNode next;

   ListNode(int var1) {
      this.val = var1;
      this.next = null;
   }
}

public class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode i = list1;
        ListNode j = list2;
        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;

        while(i!=null && j!=null)
        {
            if(i.val <= j.val)
            {
                k.next = i;
                i = i.next;
            }
            else if(i.val > j.val)
            {
                k.next = j;
                j = j.next;
            }
            k= k.next;
        }
        if(i==null) k.next = j;
        else k.next = i; 
        return dummy.next;
    }
}
