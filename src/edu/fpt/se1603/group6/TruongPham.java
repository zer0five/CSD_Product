package edu.fpt.se1603.group6;

import java.util.LinkedList;

public class TruongPham {
    public void findProduct(LinkedList<Product> list, String find) {
        for (Product product : list) {
            if (product.getName().toLowerCase().contains(find.toLowerCase()) ) {
                System.out.println(product);
            }
        }
    }
}
