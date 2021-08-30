package com.bridgelabz;

public abstract class INode<E> {
    E getKey() {
        return null;
    }

    abstract void setKey(E key);

    INode<E> getNext() {
        return null;
    }


    abstract void setNext(INode<E> next);

}
