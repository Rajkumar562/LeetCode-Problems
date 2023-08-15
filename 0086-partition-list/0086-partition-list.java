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
    public ListNode partition(ListNode head, int x) {
        if(head==null)
        return head;
        ListNode newNode=new ListNode(-300);
        ListNode prev=new ListNode(-300);
        ListNode point=null;
        ListNode start=null;
        while(head!=null)
        {
            if(head.val<x)
            {
                if(newNode.val==-300)
                {
                    newNode.val=head.val;
                    start=newNode;
                }
                else
                {ListNode add=new ListNode(head.val);
                newNode.next=add;
                newNode=newNode.next;}
            }
            else
            {
                if(prev.val==-300)
                {
                    prev.val=head.val;
                    point=prev;
                }
                else
                {ListNode add=new ListNode(head.val);
                prev.next=add;
                prev=prev.next;}
            }
            head=head.next;
        }

        if(newNode.val==-300)
        return point;
        if(prev.val==-300)
        return start;

        newNode.next=point;
        return start;
    }
}