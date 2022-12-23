package main.java.com.sindhuk.leetcode.ds1.linklist;

public class LC_206 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
        this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return head;
        }

        // 1 2 3 4 5
        ListNode nextNode = head.next; // 2
        head.next = null; // 1 -> null
        ListNode temp;
        while(nextNode != null ){
            temp = nextNode.next; //3 = temp
            nextNode.next = head; // 2 -> 1
            head = nextNode; // 2
            nextNode = temp;  // 3

        }
        return head;
    }



}
