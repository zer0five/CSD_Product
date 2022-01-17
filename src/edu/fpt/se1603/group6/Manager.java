package edu.fpt.se1603.group6;

import java.util.LinkedList;

public abstract class Manager<T> {

    protected LinkedList<T> list;

    protected Manager(LinkedList<T> list) {
        this.list = list;
    }

    public abstract String choice();

    public abstract boolean handler(String choice);

    public abstract T input();

    public abstract void add();

    public abstract void update();

    public abstract void display();
}
