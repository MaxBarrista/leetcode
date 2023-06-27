package com.barrista.leetcode;

import org.junit.jupiter.api.Test;
import com.barrista.leetcode.MergeTwoSortedLists.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {
  ReverseLinkedList solution = new ReverseLinkedList();

  @Test
  void givenList12345_whenReverseList_thenReturnList54321() {
    ListNode initialNode = new ListNode(5);
    initialNode = new ListNode(4, initialNode);
    initialNode = new ListNode(3, initialNode);
    initialNode = new ListNode(2, initialNode);
    initialNode = new ListNode(1, initialNode);

    ListNode expected = new ListNode(1);
    expected = new ListNode(2, expected);
    expected = new ListNode(3, expected);
    expected = new ListNode(4, expected);
    expected = new ListNode(5, expected);

    assertEquals(expected, solution.reverseList(initialNode));
  }

  @Test
  void givenList23_whenReverseList_thenReturnList32() {
    ListNode initialNode = new ListNode(3);
    initialNode = new ListNode(2, initialNode);

    ListNode expected = new ListNode(2);
    expected = new ListNode(3, expected);

    assertEquals(expected, solution.reverseList(initialNode));
  }
  @Test
  void givenList1_whenReverseList_thenReturnList1() {
    ListNode initialNode = new ListNode(1);

    ListNode expected = new ListNode(1);

    assertEquals(expected, solution.reverseList(initialNode));
  }

  @Test
  void givenEmptyList_whenReverseList_thenReturnEmptyList() {
    ListNode initialNode = null;

    ListNode expected = null;

    assertEquals(expected, solution.reverseList(initialNode));
  }

  @Test
  void givenList1345_whenReverseList_thenNotReturnList54321() {
    ListNode initialNode = new ListNode(5);
    initialNode = new ListNode(4, initialNode);
    initialNode = new ListNode(3, initialNode);
    initialNode = new ListNode(1, initialNode);

    ListNode expected = new ListNode(1);
    expected = new ListNode(2, expected);
    expected = new ListNode(3, expected);
    expected = new ListNode(4, expected);
    expected = new ListNode(5, expected);

    assertNotEquals(expected, solution.reverseList(initialNode));
  }

  @Test
  void givenList12345_whenReverseList_thenNotReturnList5432() {
    ListNode initialNode = new ListNode(5);
    initialNode = new ListNode(4, initialNode);
    initialNode = new ListNode(3, initialNode);
    initialNode = new ListNode(2, initialNode);
    initialNode = new ListNode(1, initialNode);

    ListNode expected = new ListNode(2);
    expected = new ListNode(3, expected);
    expected = new ListNode(4, expected);
    expected = new ListNode(5, expected);

    assertNotEquals(expected, solution.reverseList(initialNode));
  }
}
