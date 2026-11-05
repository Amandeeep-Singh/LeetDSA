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
        Set<ListNode> set=new HashSet<>();
        ListNode t=headA,p=headB;
        while(t!=null){
            set.add(t);
            t=t.next;
        }
        while(p!=null){
            if(set.contains(p))break;
            p=p.next;
        }
        return p;
    }
}