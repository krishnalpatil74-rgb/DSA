/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode fast=head;
        ListNode  slow= head;

        while(fast!=null && fast.next!= null){

            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){

               slow=head;

               while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
               }
               //any pointer fast or slow can be returned both are at same position after thet moved by one both fast and slow thet again meet
               return slow;
            }
        }
        return null;
        
    }
}