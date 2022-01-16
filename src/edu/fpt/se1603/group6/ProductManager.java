package edu.fpt.se1603.group6;

import java.util.Scanner;

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
                System.out.println("====[ Add product ]====");
                add(input());
                break;
            case "2":
                System.out.println("====[ Find product ]====");
                find(input.getString("Enter name: "));
                break;
            case "3":
                System.out.println("====[ Edit product ]====");
                Product product;
                while (true) {
                    int id = input.getInt("Enter id: ");
                    product = findExact(String.valueOf(id));
                    if (product == null) {
                        System.out.println("Product with id " + id + " is not existed!");
                    } else {
                        break;
                    }
                }
                edit(product);
                break;
            case "4":
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid choice, please choose from 1 to 4!");
                break;
        }
    }

    @Override
    public Product input() {
        Product product = new Product();
        while (true) {
            int id = input.getInt("Enter id: ");
            if (findExact(String.valueOf(id)) == null) {
                product.setId(id);
                break;
            } else {
                System.out.println("Id is existed, please try again!");
            }
        }
        product.setName(input.getString("Enter name: "));
        product.setQuantity(input.getInt("Enter quantity: "));
        product.setPrice(input.getDouble("Enter price: "));
        return product;
    }

    @Override
    public void add(Product product) {
        list.add(product);
    }

    @Override
    public void edit(Product product) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input price for product: ");
        product.setPrice(sc.nextDouble());
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
        for (Product product : list) {
            if (String.valueOf(product.getId()).equals(id)) {
                return product;
            }
        }
        return null;
    }
}
