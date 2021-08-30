package com.bridgelabz;

/*
MyNode class declaring the Node Value and the Next value
using Getter and Setter Method
 */
public class MyNode<T> implements INode<T> {
    private T data;
    private MyNode next;

    MyNode() {

    }

    //constructor with Node fields
    public MyNode(T data) {
        this.setData(data);
        this.setNext(null);
    }

    @Override
    public T getData() {
        return data;
    }

    @Override
    public void setData(T data) {
        this.data = data;
    }

    public INode getNext() {
        return next;
    }

    public void setNext(INode next) {
        this.next = (MyNode<T>) next;
    }
}
