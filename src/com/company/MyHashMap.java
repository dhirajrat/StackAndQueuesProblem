package com.company;

public class MyHashMap<K,V> {
    MyLinkedList<K> myLinkedList;

    public MyHashMap(MyLinkedList<K> myLinkedList) {
        this.myLinkedList = myLinkedList;
    }

    public MyLinkedList<K> getMyLinkedList() {
        return myLinkedList;
    }
}
