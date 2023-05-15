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
    public ListNode swapNodes(ListNode head, int k) {
        int i=0; int len=0;
        ListNode beg=null;
        ListNode temp=head;
        while(temp!=null)
        {
            len++;
            i++;
            if(i==k)
            beg=temp;
            temp=temp.next;
        }
        
        ListNode end=null;
        temp=head;
        i=0;
        while(temp!=null)
        {
            i++;
            if(i==(len-k+1))
            {
                end=temp;
                break;
            }
            temp=temp.next;
        }
       
        int swap=end.val;
        end.val=beg.val;
        beg.val=swap;
        return head;
    }
}