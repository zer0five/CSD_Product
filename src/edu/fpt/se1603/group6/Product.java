package edu.fpt.se1603.group6;

import java.io.Serializable;

/**
 * class Product
 *
 * @author Nguyễn Nhật Hùng - CE160506
 */
public class Product implements Serializable {

    /**
     * ID of the product
     */
    private int id;

    /**
     * Name of the product
     */
    private String name;

    /**
     * Price of the product
     */
    private double price;


    /**
     * Quantity of the product
     */
    private int quantity;

    /**
     * Constructor of Product class
     *
     * @author Nguyễn Nhật Hùng - CE160506
     */
    public Product() {
        id = 0;
        name = "";
        price = 0;
        quantity = 0;
    }

    /**
     * Get the id of the product
     *
     * @return the id of the product
     * @author Nguyễn Nhật Hùng - CE160506
     */
    public int getId() {
        return id;
    }

    /**
     * Set the id of the product
     *
     * @param id the id of the product
     * @author Nguyễn Nhật Hùng - CE160506
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get the name of the product
     *
     * @return the name of the product
     * @author Nguyễn Nhật Hùng - CE160506
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the product
     *
     * @param name the name of the product
     * @author Nguyễn Nhật Hùng - CE160506
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the price of the product
     *
     * @return the price of the product
     * @author Nguyễn Nhật Hùng - CE160506
     */
    public double getPrice() {
        return price;
    }

    /**
     * Get the price of the product
     *
     * @param price the price of the product
     * @author Nguyễn Nhật Hùng - CE160506
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Get the quantity of the product
     *
     * @return the quantity of the product
     * @author Nguyễn Nhật Hùng - CE160506
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Get the quantity of the product
     *
     * @param quantity the quantity of the product
     * @author Nguyễn Nhật Hùng - CE160506
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * calculate the amount
     *
     * @author Nguyễn Nhật Hùng - CE160506
     * @return calculateAmount
     */
    public double calculateAmount() {
        return getQuantity() * getPrice();
    }

    /**
     * toString
     *
     * @author Nguyễn Nhật Hùng - CE160506
     * @return toString
     */
    public String toString() {
        return String.format("| %-18s | %8d | %4.0f$ | %5.0f$ |", getName(), getQuantity(), getPrice(), calculateAmount());
    }
}
