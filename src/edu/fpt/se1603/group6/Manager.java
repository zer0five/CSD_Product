package edu.fpt.se1603.group6;

import java.util.LinkedList;

public abstract class Manager<T> {

    protected final LinkedList<T> list;

    protected Manager() {
        this.list = new LinkedList<>();
    }

    public abstract String choice();

    public abstract void handler(String choice);

    public abstract T input();

    public abstract void add(T t);

    public abstract void edit(T t);

    public abstract void find(String query);

    public abstract T findExact(String query);
}
