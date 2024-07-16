/*
 You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Example 2:
Input: l1 = [0], l2 = [0]
Output: [0]

Example 3:
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 

Constraints:
The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zero
 */




//Answer 
/* 

public class LeetCode02 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode newnode = new ListNode(0);
        ListNode q1=newnode;
        while(l1!=null || l2!=null){
            int sum=0+carry;
            if(l1!=null){
                sum = sum+l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum = sum+l2.val;
                l2=l2.next;
            }
            carry=sum/10;
            sum=sum%10;
            q1.next=new ListNode(sum);
            q1=q1.next;
        }
        if(carry==1){
            q1.next=new ListNode(1);
            q1=q1.next;
        }
        return newnode.next;
    }

}
*/