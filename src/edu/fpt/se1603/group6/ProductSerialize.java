package edu.fpt.se1603.group6;

import java.io.*;
import java.util.LinkedList;

/**
 * class ProductSerialize
 *
 * @author Trịnh Đức Tuấn Khoa - CE160799
 */
public class ProductSerialize {
    /**
     * The file
     */
    private File file;

    /**
     * Constructor of ProductSerialize class
     *
     * @param fileName File name
     */
    public ProductSerialize(String fileName) {
        this.file = new File(fileName);
    }

    /**
     * Get file
     *
     * @return The file
     * @author Trịnh Đức Tuấn Khoa - CE160799
     */
    public File getFile() {
        return file;
    }

    /**
     * Set file
     *
     * @author Trịnh Đức Tuấn Khoa - CE160799
     */
    public void setFile(File file) {
        this.file = file;
    }

    /**
     * Load Products to LinkedList
     *
     * @return An empty LinkedList if file is not exists or load failed, otherwise LinkedList of Products
     * @author Trịnh Đức Tuấn Khoa - CE160799
     */
    public LinkedList<Product> loadProducts() {
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

    /**
     * Save Products to file
     *
     * @author Trịnh Đức Tuấn Khoa - CE160799
     * @return true if success, otherwise false
     */
    public boolean saveProducts(LinkedList<Product> list) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(list);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
