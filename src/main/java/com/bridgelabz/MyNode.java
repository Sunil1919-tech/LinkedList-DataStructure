package com.bridgelabz;
/*
MyNode class declaring the Node Value and the Next value
using Getter and Setter Method
 */
public class MyNode<K> {
    private K key;
    private MyNode<K> next;

    public MyNode(K key) {
        this.key = key;
        this.next = null;
    }

    public MyNode<K> getNext() {
        return next;
    }

    public void setNext(MyNode<K> next) {
        this.next = next;
    }
}
