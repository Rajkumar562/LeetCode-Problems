/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head.next;

        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode rev=reverse(slow.next);
        slow.next=null;

        ListNode temp=head;int max=0;
        while(temp!=null)
        {
            max=Math.max(max,temp.val+rev.val);
            temp=temp.next;
            rev=rev.next;
        }
        return max;
    }
    public ListNode reverse(ListNode head)
    {
        ListNode cur=head;
        ListNode prev=null;
        ListNode after=null;

        while(cur!=null)
        {
            after=cur.next;
            cur.next=prev;
            prev=cur;
            cur=after;
        }
        return prev;
    }
}