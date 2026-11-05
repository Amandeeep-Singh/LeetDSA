/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t=headA,p=headB;
        while(t!=p){
            t=t==null?headB:t.next;
            p=p==null?headA:p.next;
        }
        return t;
    }
}