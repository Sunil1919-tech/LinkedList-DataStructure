package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * purpose- test cases to create the LinkedList using Data Structures
 * @author Sunil
 * @version 16.0
 * @since 22/08/2021
 */
public class LinkedListTest {
    //testCase to Add the Nodes for the Linked List
    @Test
    public void givenThreeNumber_whenAddedToLinkedListShouldAddedToTheTop() {

        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myFirstNode = new MyNode<>(56);

        LinkedList<Integer> myLinkedList = new LinkedList<>();

        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);

        myLinkedList.printMyNodes();

        boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myFirstNode);
        Assertions.assertTrue(result);
    }
//testCase To Implement the appending the Linked List
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToLast() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        LinkedList<Integer> myLinkedList = new LinkedList<>();

        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);

        myLinkedList.printMyNodes();

        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }
//testCase to insert the number between two Numbers
    @Test
    public void given3NumbersWhenInsertingSecondInBetween_ShouldPassLinkedList() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        LinkedList<Integer> myLinkedList = new LinkedList<>();

        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode, mySecondNode);

        myLinkedList.printMyNodes();

        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }
}

