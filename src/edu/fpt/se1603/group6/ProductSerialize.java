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
     * File of file
     */
    private File file;

    /**
     *Constructor of productSerialize
     *
     * @param fileName
     */
    public ProductSerialize(String fileName) {
        this.file = new File(fileName);
    }

    /**
     * Get file of productSerialize
     *
     * @author Trịnh Đức Tuấn Khoa - CE160799
     * @return file
     */
    public File getFile() {
        return file;
    }

    /**
     * Set file of productSerialize
     *
     * @author Trịnh Đức Tuấn Khoa - CE160799
     */
    public void setFile(File file) {
        this.file = file;
    }

    /**
     * Load Products to LinkedList
     *
     * @author Trịnh Đức Tuấn Khoa - CE160799
     * @return The list
     */
    public LinkedList<Product> loadProducts() {
        LinkedList<Product> list = new LinkedList<>();
        if (file.exists()) {
            try {
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                return (LinkedList<Product>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                return list;
            }
        } else {
           return list;
        }
    }

    /**
     * Save Products to file
     *
     * @author Trịnh Đức Tuấn Khoa - CE160799
     * @return true if success, otherwise false
     */
    public boolean saveProducts(LinkedList<Product> list) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
