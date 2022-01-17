package edu.fpt.se1603.group6;

import java.io.*;
import java.util.LinkedList;

/**
 * class ProductsSerializer
 *
 * @author Trịnh Đức Tuấn Khoa - CE160799
 */
public class ProductsSerializer implements Serializer<LinkedList<Product>> {

    /**
     * The file
     */
    private final File file;

    /**
     * Constructor of ProductsSerializer class
     *
     * @param fileName File name
     */
    public ProductsSerializer(String fileName) {
        this.file = new File(fileName);
    }

    /**
     * Save Products to file
     *
     * @return true if success, otherwise false
     * @author Trịnh Đức Tuấn Khoa - CE160799
     */
    @Override
    public boolean serialize(LinkedList<Product> products) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(products);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    /**
     * Load Products to LinkedList
     *
     * @return An empty LinkedList if file is not exists or load failed, otherwise LinkedList of Products
     * @author Trịnh Đức Tuấn Khoa - CE160799
     */
    @Override
    public LinkedList<Product> deserialize() {
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                // noinspection unchecked
                return (LinkedList<Product>) ois.readObject();
            } catch (IOException | ClassNotFoundException | ClassCastException ignored) {
                // IGNORED
            }
        }
        return new LinkedList<>();
    }

}
