package main.java.com.sindhuk.leetcode.ds1.linklist;

public class LC_203 {
 public class ListNode {
     int val;
     ListNode next;

     ListNode() {
     }

     ListNode(int val) {
         this.val = val;
     }

     ListNode(int val, ListNode next) {
         this.val = val;
         this.next = next;
     }
 }
   public ListNode removeElements(ListNode head, int val) {
       while(head.val == val && head != null) {
           head = head.next;
       }

       if(head == null) {
           return head;
       }

       ListNode iterator = head;

       while(iterator.next != null){
        if(iterator.next.val == val) {
            iterator.next = iterator.next.next;
        } else {
            iterator = iterator.next;
        }
       }
     return head;
    }
}
