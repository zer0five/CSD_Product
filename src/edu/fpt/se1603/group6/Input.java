package edu.fpt.se1603.group6;

import java.util.Scanner;

public class Input {

    private final Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString(String message) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("You must enter something!");
            } else {
                return input;
            }
        }
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

    public double getDouble(String message) {
        while (true) {
            try {
                return Double.parseDouble(getString(message));
            } catch (NumberFormatException e) {
                System.out.println("You must enter a number!");
            }
        }
    }
}
