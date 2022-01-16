package edu.fpt.se1603.group6;

import java.util.Scanner;

public class Input {

    private final Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public int getInt(String message) {
        while (true) {
            try {
                return Integer.parseInt(getString(message));
            } catch (NumberFormatException e) {
                System.out.println("You must enter a number!");
            }
        }
    }


}
