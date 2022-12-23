package main.java.com.sindhuk.leetcode.ds1.linklist;

public class LC_141 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode secondHead = head;
        int counter = 1;
        while(head.next != null && secondHead.next != null) {
            if(secondHead.next.equals(head.next)){
                return true;
            }
            if(counter % 3 == 0) {
                secondHead = secondHead.next;
            } else {
                head = head.next;
            }
            ++counter;
        }
        return false;
    }


    //Optimized alternate solution from leetcode
    public boolean hasCycle2(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
