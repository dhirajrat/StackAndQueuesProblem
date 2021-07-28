package com.company;

public class MyMapNode<K,V> implements INode {
    K key;
    V value;
    MyMapNode next;

    public V getValue() { return this.value;}

    public void setValue(V value) {this.value = value;}

    @Override
    public void setKey(Object key) {

    }

    @Override
    public Object getKey() {
        return null;
    }

    @Override
    public void setNext(INode next) {
        this.next = (MyMapNode<K,V>) next;
    }

    @Override
    public INode getNext() {
        return null;
    }

    @Override
    public String toString() {
        return "MyMapNode{" +
                "key=" + key +
                ", value=" + value +
                ", next=" + next +
                '}';
    }
}
