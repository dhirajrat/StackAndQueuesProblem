package com.company;

public class MyStack {



    private MyLinkedList myLinkedList = null;



    private int default_size = 3;




    public MyStack() {

        myLinkedList = new MyLinkedList<>();

    }




    public MyStack(int size) {

        myLinkedList = new MyLinkedList<>();

        this.default_size = size;

    }



    public void push(INode node) {

        if(isFull()) {

            System.out.println("Stack OverFlow");

            return;

        }

        myLinkedList.add(node);

    }



    public INode pop() {

        if(isEmpty()) {

            System.out.println("Stack Underflow");

            return null;

        }

        return myLinkedList.pop();

    }



    public INode peek() {

        return myLinkedList.head;

    }



    public void printStack() {

        myLinkedList.printNodes();

    }



    public boolean isEmpty() {

        return myLinkedList.size() == 0;

    }



    public boolean isFull() {

        return myLinkedList.size() == default_size;

    }



    public int size() {

        return myLinkedList.size();



    }

}
