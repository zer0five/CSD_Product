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
     * @author Nguyễn Nhật Hùng - CE160506
     * @return the id of the product
     */
    public int getId() {
        return id;
    }

    /**
     * Set the id of the product
     *
     * @author Nguyễn Nhật Hùng - CE160506
     * @param id the id of the product
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get the name of the product
     *
     * @author Nguyễn Nhật Hùng - CE160506
     * @return the name of the product
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the product
     *
     * @author Nguyễn Nhật Hùng - CE160506
     * @param name the name of the product
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the price of the product
     *
     * @author Nguyễn Nhật Hùng - CE160506
     * @return the price of the product
     */
    public double getPrice() {
        return price;
    }

    /**
     * Get the price of the product
     *
     * @author Nguyễn Nhật Hùng - CE160506
     * @param price the price of the product
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Get the quantity of the product
     *
     * @author Nguyễn Nhật Hùng - CE160506
     * @return the quantity of the product
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Get the quantity of the product
     *
     * @author Nguyễn Nhật Hùng - CE160506
     * @param quantity the quantity of the product
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
