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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode l=mergeSort(head);
        return l;
    }
    ListNode mergeSort(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode f=head,s=head;
        while(f.next!=null && f.next.next!=null){
            f=f.next.next;
            s=s.next;
        }
        ListNode l2=s.next;
        s.next=null;
        head=mergeSort(head);
        l2=mergeSort(l2);
        return merge(head,l2);
    }
    ListNode merge(ListNode l1,ListNode l2){
        ListNode l=new ListNode();
        ListNode d=l;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                d.next=new ListNode(l1.val);
                d=d.next;
                l1=l1.next;
            }
            else{
                d.next=new ListNode(l2.val);
                d=d.next;
                l2=l2.next;
            }
        }
        while(l1!=null){
            d.next=new ListNode(l1.val);
            d=d.next;
            l1=l1.next;
        }
        while(l2!=null){
            d.next=new ListNode(l2.val);
            d=d.next;
            l2=l2.next;
        }
        return l.next;
    }
}