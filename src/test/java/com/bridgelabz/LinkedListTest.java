package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * purpose- test cases to create the LinkedList using Data Structures
 *
 * @author Sunil
 * @version 16.0
 * @since 22/08/2021
 */
public class LinkedListTest {
    @Test
    public void GivenThreeNumbers_WhenAddedToLinkedList_ShouldBeAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
        myLinkedList.addFirst(myFirstNode);
        myLinkedList.addFirst(mySecondNode);
        myLinkedList.addFirst(myThirdNode);
        boolean result = (myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
                && myLinkedList.tail.equals(myFirstNode));
        Assertions.assertEquals(true, result);
    }

    //Created Simple Linked List and Added to The Last position
    @Test
    public void GivenThreeNumbers_WhenAddedToLinkedList_ShouldAddedToBottom() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
        myLinkedList.addLast(myFirstNode);
        myLinkedList.addLast(mySecondNode);
        myLinkedList.addLast(myThirdNode);
        boolean result = (myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
                && myLinkedList.tail.equals(myThirdNode));
        Assertions.assertEquals(true, result);
    }

    // Insert  A element Between 2 nodes
    @Test
    public void GivenANodeInsertedInBetweenResultingNodes_ShouldReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        LinkedList<Integer> LinkedList = new LinkedList<Integer>();
        LinkedList.addLast(myFirstNode);
        LinkedList.addLast(myThirdNode);
        LinkedList.insertNode(myFirstNode, mySecondNode);
        boolean result = (LinkedList.head.equals(myFirstNode) && LinkedList.head.getNext().equals(mySecondNode)
                && LinkedList.tail.equals(myThirdNode));
        Assertions.assertEquals(true, result);
    }

    // Delete First Node
    @Test
    public void PopNodeFromFront_ShouldReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        LinkedList<Integer> LinkedList = new LinkedList<Integer>();
        LinkedList.addFirst(myFirstNode);
        LinkedList.addFirst(mySecondNode);
        LinkedList.addFirst(myThirdNode);
        INode<Integer> deletedNode = LinkedList.popFirst();
        Assertions.assertEquals(deletedNode, myThirdNode);
    }

    //Delete Last Node
    @Test
    public void PopNodeFromLast_ShouldReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        LinkedList<Integer> LinkedList = new LinkedList<Integer>();
        LinkedList.addFirst(myFirstNode);
        LinkedList.addFirst(mySecondNode);
        LinkedList.addFirst(myThirdNode);
        INode<Integer> deletedNode = LinkedList.popLast();
        Assertions.assertEquals(deletedNode, myFirstNode);
    }

    //Search Node With A given Element
    @Test
    public void SearchNodeForGivenDataIfFound_ShouldReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        LinkedList<Integer> LinkedList = new LinkedList<Integer>();
        LinkedList.addFirst(myFirstNode);
        LinkedList.addFirst(mySecondNode);
        LinkedList.addFirst(myThirdNode);
        INode searchNode = LinkedList.searchNode(30);
        Assertions.assertEquals(searchNode, mySecondNode);
    }

    //Search dataNode and insert
    @Test
    public void SearchDataNodeForGivenDataIfFound_ShouldInsertGivenNodeAndReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyNode<Integer> myFourthNode = new MyNode<>(40);
        LinkedList<Integer> LinkedList = new LinkedList<Integer>();
        LinkedList.addFirst(myFirstNode);
        LinkedList.addFirst(mySecondNode);
        LinkedList.addFirst(myThirdNode);
        INode searchNode = LinkedList.searchNode(30);
        LinkedList.insertNode(searchNode, myFourthNode);
        boolean result = (LinkedList.head.equals(myThirdNode) && LinkedList.head.getNext().equals(searchNode)
                && LinkedList.head.getNext().getNext().equals(myFourthNode)
                && LinkedList.tail.equals(myFirstNode));
        Assertions.assertEquals(true, result);
    }

    //deleting the inserted Node 40
    @Test
    public void DeleteNodeFromLinkedlistIfDeletedShouldReturnSizeAndReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(40);
        MyNode<Integer> myThirdNode = new MyNode<>(30);
        MyNode<Integer> myFourthNode = new MyNode<>(56);
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
        myLinkedList.addFirst(myFirstNode);
        myLinkedList.addFirst(mySecondNode);
        myLinkedList.addFirst(myThirdNode);
        myLinkedList.addFirst(myFourthNode);
        myLinkedList.popNode(40);
        int size = myLinkedList.getSize();
        Assertions.assertEquals(3, size);
    }
}

