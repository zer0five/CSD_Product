package edu.fpt.se1603.group6;

import java.util.Scanner;

/**
 * Input utils
 *
 * @author Giang Trương Gia Lạc
 */
public class Input {

    /**
     * Standard input scanner
     */
    private final Scanner scanner;

    /**
     * Constructor for Input class
     *
     * @author Giang Trương Gia Lạc
     */
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Get string from standard input
     *
     * @param message Message to display
     * @return The string
     * @author Giang Trương Gia Lạc
     */
    public String getString(String message) {
        System.out.print(message);
        return scanner.nextLine().trim();
    }

    /**
     * Get string from standard input, but not empty
     *
     * @param message Message to display
     * @return The string (not empty)
     * @author Giang Trương Gia Lạc
     */
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

    /**
     * Get integer from standard input
     *
     * @param message Message to display
     * @return The integer
     * @author Giang Trương Gia Lạc
     */
    public int getInt(String message) {
        while (true) {
            try {
                return Integer.parseInt(getStringNotEmpty(message));
            } catch (NumberFormatException e) {
                System.out.println("You must enter a number!");
            }
        }
    }

    /**
     * Get integer from standard input, value must be greater than min
     *
     * @param message Message to display
     * @param min     Minimum value
     * @return The integer
     * @author Giang Trương Gia Lạc
     */
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

    /**
     * Get double from standard input
     *
     * @param message Message to display
     * @return The double
     * @author Giang Trương Gia Lạc
     */
    public double getDouble(String message) {
        while (true) {
            try {
                return Double.parseDouble(getStringNotEmpty(message));
            } catch (NumberFormatException e) {
                System.out.println("You must enter a number!");
            }
        }
    }

    /**
     * Get double from standard input, value must be greater than min
     *
     * @param message Message to display
     * @param min     Minimum value
     * @return The double
     * @author Giang Trương Gia Lạc
     */
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
