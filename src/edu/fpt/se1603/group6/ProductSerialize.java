package edu.fpt.se1603.group6;

import java.io.*;
import java.util.LinkedList;
import java.util.Objects;

public class ProductSerialize {
    private File file;
    public ProductSerialize(String fileName) {
        this.file = new File(fileName);
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

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
