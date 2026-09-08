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
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=reverse(slow.next);
        slow.next=temp;
        ListNode p1=head;
        ListNode p2=slow.next;
        int sum=0;
        int maxsum=0;
        while(p2!=null){
            sum=p1.val+p2.val;
            if(sum>maxsum) maxsum=sum;
            sum=0;
            p1=p1.next;
            p2=p2.next;
        }
        return maxsum;
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode agla=null;
        while(curr!=null){
            agla=curr.next;
            curr.next=prev;
            prev=curr;
            curr=agla;
        }
        return prev;
    }
}