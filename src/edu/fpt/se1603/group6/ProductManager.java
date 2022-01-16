package edu.fpt.se1603.group6;

import java.util.LinkedList;

public class ProductManager extends Manager<Product> {

    private final Input input;

    public ProductManager() {
        super();
        this.input = new Input();
    }

    @Override
    public String choice() {
        System.out.println("1. Add product");
        System.out.println("2. Find product");
        System.out.println("3. Edit product");
        System.out.println("4. Quit");
        return input.getString("Enter your choice: ");
    }

    @Override
    public void handler(String choice) {
        switch (choice) {
            case "1":
//                add();
                break;
            case "2":
//                find();
                break;
            case "3":
//                edit();
                break;
        }
    }

    @Override
    public void add(Product product) {
        list.add(product);
    }

    @Override
    public void edit(Product product) {

    }

    @Override
    public void find(String name) {
        for (Product product : list) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(product);
            }
        }
    }

    @Override
    public Product findExact(String id) {
        return null;
    }
}
