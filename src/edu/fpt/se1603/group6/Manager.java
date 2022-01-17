package edu.fpt.se1603.group6;

import java.util.LinkedList;

/**
 * Abstract class for Manager
 *
 * @param <T> type of object that Manager manages
 * @author Giang Trương Gia Lạc - CE160766
 */
public abstract class Manager<T> {

    /**
     * List of managed objects
     */
    protected LinkedList<T> list;

    /**
     * Constructor for Manager
     *
     * @param list list of managed objects
     * @author Giang Trương Gia Lạc - CE160766
     */
    protected Manager(LinkedList<T> list) {
        this.list = list;
    }

    /**
     * Get user choice
     *
     * @return user choice
     * @author Giang Trương Gia Lạc - CE160766
     */
    public abstract String choice();

    /**
     * Handle user choice
     *
     * @param choice user choice
     * @return true if continued, false if stop
     * @author Giang Trương Gia Lạc - CE160766
     */
    public abstract boolean handle(String choice);

    /**
     * Input a new object
     *
     * @return new object
     * @author Giang Trương Gia Lạc - CE160766
     */
    public abstract T input();

    /**
     * Add a new object from user input
     *
     * @author Giang Trương Gia Lạc - CE160766
     */
    public abstract void add();

    /**
     * Update an object information
     *
     * @author Giang Trương Gia Lạc - CE160766
     */
    public abstract void update();

    /**
     * Display all objects
     *
     * @author Giang Trương Gia Lạc - CE160766
     */
    public abstract void display();

}
