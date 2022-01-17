package edu.fpt.se1603.group6;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ProductsSerializer productsSerializer = new ProductsSerializer("products.txt");
        LinkedList<Product> products = productsSerializer.deserialize();
        ProductManager productManager = new ProductManager(products);
        String choice;
        do {
            choice = productManager.choice();
        } while (productManager.handle(choice));
        productsSerializer.serialize(productManager.getProducts());
    }
}
