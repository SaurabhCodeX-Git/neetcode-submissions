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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            int sum = carry;
            if(l1 != null){
                int v1= l1.val;
                sum += v1;
                l1 = l1.next;
            }
            if(l2 != null){
                int v2= l2.val;
                sum += v2;
                l2 = l2.next;
            }
            
            //sum = sum+v1+v2;
            int temp = sum;
            carry = temp/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;

        }

        return dummy.next;

    }
}
