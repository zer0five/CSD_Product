package edu.fpt.se1603.group6;

import java.util.LinkedList;
import java.util.Optional;

public class ProductManager extends Manager<Product> {

    private final Input input;

    public ProductManager(LinkedList<Product> list) {
        super(list);
        this.input = new Input();
    }

    @Override
    public String choice() {
        System.out.println("1. Add a product");
        System.out.println("2. Find product by name");
        System.out.println("3. Update product information");
        System.out.println("4. Quit");
        return input.getStringNotEmpty("Enter your choice: ");
    }

    @Override
    public boolean handle(String choice) {
        switch (choice) {
            case "1":
                add();
                display();
                break;
            case "2":
                search();
                break;
            case "3":
                update();
                display();
                break;
            case "4":
                System.out.println("Goodbye!");
                return false;
            default:
                System.out.println("Invalid choice, please choose from 1 to 4!");
                break;
        }
        return true;
    }

    @Override
    public Product input() {
        Product product = new Product();
        while (true) {
            int id = input.getInt("Enter id: ");
            Optional<Product> productOptional = getProductById(id);
            if (productOptional.isPresent()) {
                System.out.println("Id is existed, please try again!");
            } else {
                product.setId(id);
                break;
            }
        }
        product.setName(input.getStringNotEmpty("Enter name: "));
        product.setQuantity(input.getInt("Enter quantity: ", 0));
        product.setPrice(input.getDouble("Enter price: ", 0));
        return product;
    }

    public void add() {
        System.out.println("====[ Add product ]====");
        list.add(input());
    }

    public void search() {
        System.out.println("====[ Find product ]====");
        String query = input.getString("Enter name: ").toLowerCase();
        if (query.isEmpty()) {
            display();
        } else {
            System.out.println("+-----+--------------------+----------+-------+--------+");
            System.out.println("| ID  | Product            | Quantity | Price | Amount |");
            System.out.println("+-----+--------------------+----------+-------+--------+");
            boolean found = false;
            for (Product product : list) {
                if (product.getName().toLowerCase().contains(query)) {
                    System.out.println(product);
                    if (!found) {
                        found = true;
                    }
                }
            }
            if (!found) {
                System.out.println("|                  No product found!                   |");
            }
            System.out.println("+-----+--------------------+----------+-------+--------+");
        }
    }

    public Optional<Product> getProductById(int id) {
        for (Product product : list) {
            if (product.getId() == id) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }

    public void update() {
        System.out.println("====[ Edit product ]====");
        Product product;
        while (true) {
            int id = input.getInt("Enter id: ");
            Optional<Product> optionalProduct = getProductById(id);
            if (optionalProduct.isPresent()) {
                product = optionalProduct.get();
                break;
            } else {
                System.out.println("Product with id " + id + " is not existed!");
            }
        }
        product.setPrice(input.getDouble("Please input new price for product: "));
    }

    @Override
    public void display() {
        System.out.println("+-----+--------------------+----------+-------+--------+");
        System.out.println("| ID  | Product            | Quantity | Price | Amount |");
        System.out.println("+-----+--------------------+----------+-------+--------+");
        for (Product product : list) {
            System.out.println(product);
        }
        System.out.println("+-----+--------------------+----------+-------+--------+");
    }

    public LinkedList<Product> getProducts() {
        return list;
    }
}
