package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * purpose-declaring the test case for Creating Simple Linked List
 *
 * @author Sunil
 * @version 16.0
 * @since 21/08/2021
 */
public class MyNodeTest {
    @Test
    public void givenCallShouldPrintWelcomeMessage() {
        MyNode myFirstNode = new MyNode();
    }

    //created simple List
    @Test
    public void given3Number_WhenLinkedShouldPassedLinkedListTest() {

        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        LinkedList LinkedList = new LinkedList();
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);

        boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
        Assertions.assertTrue(result);
    }
}
