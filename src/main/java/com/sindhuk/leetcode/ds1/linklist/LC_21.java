package main.java.com.sindhuk.leetcode.ds1.linklist;

public class LC_21 {

    public static class ListNode {
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


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) {
            return list2;
        }

        if(list2 == null){
            return list1;
        }

        ListNode finalList;
        ListNode currentNode;
        if(list1.val > list2.val) {
            finalList = new ListNode(list2.val, null);
            list2 = list2.next;
        } else {
            finalList = new ListNode(list1.val, null);
            list1 = list1.next;
        }
        currentNode = finalList;
        while(true) {
            if(list1 == null && list2 == null) {
                return finalList;
            }

            if(list1 == null && list2 != null) {
                currentNode.next = list2;
                return  finalList;
            }

            if(list1 != null && list2 == null){
                currentNode.next = list1;
                return  finalList;
            }

            if(list1.val > list2.val) {
                currentNode.next = new ListNode(list2.val, null);
                currentNode = currentNode.next;
                list2 = list2.next;
            } else {
                currentNode.next = new ListNode(list1.val, null);
                currentNode = currentNode.next;
                list1 = list1.next;
            }

        }

    }


    public static void main(String arg[]){
        LC_21 lc_21 = new LC_21();
//        list1 = [1,2,4], list2 = [1,3,4]
        ListNode list1 = new ListNode(1, null);
        list1.next = new ListNode(2, null);
        list1.next.next = new ListNode(4, null);

        ListNode list2 = new ListNode(1, null);
        list2.next = new ListNode(3, null);
        list2.next.next = new ListNode(4, null);

        ListNode ans = lc_21.mergeTwoLists(list1, list2);
        System.out.println();
    }

}
