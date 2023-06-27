package com.barrista.leetcode;

import com.barrista.leetcode.MergeTwoSortedLists.ListNode;

public class ReverseLinkedList {
  public ListNode reverseList(ListNode head) {
    ListNode resultHead = head;

    ListNode previous = null;
    while (head != null) {
      resultHead = head;
      head = head.next;
      resultHead.next = previous;
      previous = resultHead;
    }

    return resultHead;
  }
}
