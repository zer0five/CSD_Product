package edu.fpt.se1603.group6;

import java.util.LinkedList;
import java.util.Scanner;

public class GiaAnh {
    public void update(Product product) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input price for product: ");
        product.setPrice(sc.nextDouble());
    }

    public Product findProduct(LinkedList<Product> list, int find) {
        for (Product product : list) {
            if (product.getId() == find) {
                return product;
            }
        }
        return null;
    }
}
