package main.java.com.sindhuk.leetcode.ds1.linklist;

public class LC_83 {

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

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        // 1,1,2,3,3
        ListNode preNode = head; // 1
        ListNode currNode = head.next; // 1
        while(currNode != null) {
            if(preNode.val == currNode.val) {
                preNode.next = currNode.next;
            } else {
                preNode = currNode;
            }
            currNode = currNode.next;
        }
        return head;
    }
}
