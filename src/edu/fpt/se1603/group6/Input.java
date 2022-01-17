package edu.fpt.se1603.group6;

import java.util.Scanner;

public class Input {

    private final Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString(String message) {
        System.out.print(message);
        return scanner.nextLine().trim();
    }

    public String getStringNotEmpty(String message) {
        while (true) {
            String input = getString(message);
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
                return Integer.parseInt(getStringNotEmpty(message));
            } catch (NumberFormatException e) {
                System.out.println("You must enter a number!");
            }
        }
    }

    public int getInt(String message, int min) {
        while (true) {
            int input = getInt(message);
            if (input < min) {
                System.out.println("You must enter a number greater than " + min + "!");
            } else {
                return input;
            }
        }
    }

    public double getDouble(String message) {
        while (true) {
            try {
                return Double.parseDouble(getStringNotEmpty(message));
            } catch (NumberFormatException e) {
                System.out.println("You must enter a number!");
            }
        }
    }

    public double getDouble(String message, double min) {
        while (true) {
            double input = getDouble(message);
            if (input < min) {
                System.out.println("You must enter a number greater than " + min + "!");
            } else {
                return input;
            }
        }
    }
}
