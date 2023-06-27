package com.barrista.leetcode;

public class MergeTwoSortedLists {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode head = null;
    ListNode current = null;
    ListNode nextNode;
    while (list1 != null || list2 != null) {
      // Find the smaller or non-null of the two Nodes(nextNode)
      if (list1 != null && list2 != null) {
        if (list1.val < list2.val) {
          nextNode = list1;
          list1 = list1.next;
        } else {
          nextNode = list2;
          list2 = list2.next;
        }
      } else if (list1 != null) {
        nextNode = list1;
        list1 = list1.next;
      } else {
        nextNode = list2;
        list2 = list2.next;
      }

      // Build the resulting sorted linked list of nodes
      if (current == null) {
        head = nextNode;
        current = nextNode;
      } else {
        current.next = nextNode;
        current = current.next;
      }
    }
    return head;
  }

  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) return true;
      if (!(obj instanceof ListNode && ((ListNode) obj).val == val)) {
        return false;
      }

      if (next == null) {
        return ((ListNode) obj).next == null;
      }
      return next.equals(((ListNode) obj).next);
    }
  }
}
