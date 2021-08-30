package com.bridgelabz;

public class LinkedList<T extends Comparable<T>> {
    public INode<T> head;
    public INode<T> tail;

    public void MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    //add first
    public void addFirst(INode<T> newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (head == null) {
            head = newNode;
        } else {
            INode<T> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    //add last
    public void addLast(INode<T> newNode) {
        if (this.head == null) {
            this.head = newNode;
        }
        if (tail == null) {
            tail = newNode;
        } else {
            this.tail.setNext(newNode);
            tail = newNode;
        }
    }

    //Insert the element between the elements
    public void insertNode(INode<Integer> myFirstNode, INode<Integer> mySecondNode) {
        mySecondNode.setNext(myFirstNode.getNext());
        myFirstNode.setNext(mySecondNode);
    }

    /*
    pop method to delete the first element from the List
     */
    public INode<T> popFirst() {
        INode<T> tempNode = this.head;
        this.head = this.head.getNext();
        return tempNode;
    }

    //delete last node from the Linked List
    public INode<T> popLast() {
        INode<T> tempNode = head;
        while (!(tempNode.getNext().equals(tail))) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = tempNode.getNext();
        return tempNode;
    }

    //Search the node with Given key
    public INode searchNode(T key) {
        INode tempNode = this.head;
        while (tempNode != null) {
            if (tempNode.getData() == key) {
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }

    //delete the inserted Element 40
    public void popNode(T key) {
        INode tempNode = head;
        while (tempNode.getNext().getData() != key) {
            tempNode = tempNode.getNext();
        }
        tempNode.setNext(tempNode.getNext().getNext());
    }


    public int getSize() {
        int size = 0;
        INode tempNode = head;
        while (tempNode != null) {
            size++;
            tempNode = tempNode.getNext();
        }
        return size;
    }

    // Add Node in Sorted Linked List
    public void sortedLinkedList(INode<T> newNode) {
        INode<T> tempNode = head;
        INode<T> prevNode = null;
        while (tempNode != null && (newNode.getData()).compareTo((T) tempNode.getData()) > 0) {
            prevNode = tempNode;
            tempNode = tempNode.getNext();
        }
        if (prevNode == null) {
            this.head = newNode;
        } else {
            prevNode.setNext(newNode);
        }
        newNode.setNext(tempNode);
        while (tempNode != null) {
            this.tail = tempNode;
            tempNode = tempNode.getNext();
        }
    }
}
