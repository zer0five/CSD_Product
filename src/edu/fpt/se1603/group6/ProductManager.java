package edu.fpt.se1603.group6;

import java.util.LinkedList;
import java.util.Optional;

/**
 * ProductManager class
 *
 * @author Group 6 members
 */
public class ProductManager extends Manager<Product> {

    /**
     * Instance of input
     */
    private final Input input;

    /**
     * Constructor of ProductManager
     *
     * @param list List of products
     * @author Giang Trương Gia Lạc - CE160766
     */
    public ProductManager(LinkedList<Product> list) {
        super(list);
        this.input = new Input();
    }

    /**
     * Display menu and get user choice
     *
     * @return The user choice
     * @author Giang Trương Gia Lạc - CE160766
     */
    @Override
    public String choice() {
        System.out.println("====[ Product Manager ]====");
        System.out.println("1. Add a product");
        System.out.println("2. Find product by name");
        System.out.println("3. Update product information");
        System.out.println("4. Quit");
        return input.getStringNotEmpty("Enter your choice: ");
    }

    /**
     * Handle user choice
     *
     * @param choice user choice
     * @return true if user want to continue, false if user want to quit
     * @author Giang Trương Gia Lạc - CE160766
     */
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

    /**
     * Input product information
     *
     * @return The product
     * @author Trương Hồ Gia Anh - CE160788
     */
    @Override
    public Product input() {
        Product product = new Product();
        while (true) {
            int id = input.getInt("Please enter product id: ");
            Optional<Product> productOptional = getProductById(id);
            if (productOptional.isPresent()) {
                System.out.println("Id is existed, please try again!");
            } else {
                product.setId(id);
                break;
            }
        }
        product.setName(input.getStringNotEmpty("Please enter product name: "));
        product.setQuantity(input.getInt("Please enter product quantity: ", 0));
        product.setPrice(input.getDouble("Please enter product price: ", 0));
        return product;
    }

    /**
     * Add a product to list
     *
     * @author Trương Hồ Gia Anh - CE160788
     */
    public void add() {
        System.out.println("====[ Add product ]====");
        list.add(input());
    }

    /**
     * Search product by name and display all matched products
     *
     * @author Phạm Trịnh Trọng Trường - CE160865
     */
    public void search() {
        System.out.println("====[ Find product ]====");
        String query = input.getString("Please enter product name: ").toLowerCase();
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

    /**
     * Get product by id
     *
     * @param id id of product
     * @return Optional of product
     * @author Trương Hồ Gia Anh - CE160788
     */
    public Optional<Product> getProductById(int id) {
        for (Product product : list) {
            if (product.getId() == id) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }

    /**
     * Update product information
     *
     * @author Trương Hồ Gia Anh - CE160788
     */
    public void update() {
        System.out.println("====[ Edit product ]====");
        Product product;
        while (true) {
            int id = input.getInt("Please enter product id: ");
            Optional<Product> optionalProduct = getProductById(id);
            if (optionalProduct.isPresent()) {
                product = optionalProduct.get();
                break;
            } else {
                System.out.println("Product with id " + id + " is not existed!");
            }
        }
        System.out.println("+-----+--------------------+----------+-------+--------+");
        System.out.println("| ID  | Product            | Quantity | Price | Amount |");
        System.out.println("+-----+--------------------+----------+-------+--------+");
        System.out.println(product);
        System.out.println("+-----+--------------------+----------+-------+--------+");
        double price = input.getDouble("Please input new price for product: ", 0);
        if (price == product.getPrice()) {
            System.out.println("Warning: Price is not changed!");
        } else {
            product.setPrice(price);
        }
    }

    /**
     * Display all products
     *
     * @author Phạm Trịnh Trọng Trường - CE160865
     */
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

    /**
     * Get list of products
     *
     * @return list of products
     * @author Giang Trương Gia Lạc - CE160766
     */
    public LinkedList<Product> getProducts() {
        return list;
    }

}
