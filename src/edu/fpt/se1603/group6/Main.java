package edu.fpt.se1603.group6;

import java.util.LinkedList;

/**
 * Main class
 *
 * @author Group 6 members
 */
public class Main {

    /**
     * Main method
     *
     * @author Group 6 members
     */
    public static void main(String[] args) {
        ProductsSerializer productsSerializer = new ProductsSerializer("products.txt");
        LinkedList<Product> products = productsSerializer.deserialize();
        ProductManager productManager = new ProductManager(products);
        String choice;
        do {
            choice = productManager.choice();
        } while (productManager.handle(choice));
        if (!productsSerializer.serialize(productManager.getProducts())) {
            System.out.println("Warning: Cannot save products to file, your data may be lost!");
            System.out.println("Here is the list of products:");
            productManager.display();
        }
    }

}
