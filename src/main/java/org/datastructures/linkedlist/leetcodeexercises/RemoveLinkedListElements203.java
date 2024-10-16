package org.datastructures.linkedlist.leetcodeexercises;

import org.datastructures.linkedlist.Node;

import javax.print.attribute.DateTimeSyntax;
import java.util.ArrayList;
import java.util.List;

public class RemoveLinkedListElements203 {

    // Link: https://leetcode.com/problems/remove-linked-list-elements/description/
    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public ListNode removeElements(ListNode head, int val) {

            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode currentNode = dummy;

            while (currentNode.next != null) {
                if (currentNode.next.val == val) {
                    currentNode.next = currentNode.next.next;
                } else {
                    currentNode = currentNode.next;
                }
            }

            return dummy.next;
        }
    }
}
