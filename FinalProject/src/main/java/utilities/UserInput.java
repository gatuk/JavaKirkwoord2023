package utilities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    public static String getString(Scanner scanner, String prompt) {
        String value = "";
        System.out.print(prompt + ": ");
        value = scanner.nextLine();
        return value;
    }
    public static boolean getBoolean(Scanner scanner, String prompt) {
    String value = "";
    do {
        System.out.print(prompt + " [Yes, No]: ");
        value = scanner.nextLine();
        if (value.equals("")) break;


    } while (!value.equalsIgnoreCase("Yes")
            && !value.equalsIgnoreCase("No")
            && !value.equalsIgnoreCase("Y")
            && !value.equalsIgnoreCase("N"));
    return value.equalsIgnoreCase("Yes") || value.equalsIgnoreCase("Y");
}

    public static int getInt(Scanner scanner, String prompt) {
        return getInt(scanner, prompt, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static int getInt(Scanner scanner, String prompt, int min) {
        return getInt(scanner, prompt, min, Integer.MAX_VALUE);
    }

    public static int getInt(Scanner scanner, String prompt, int min, int max) {
        int value = 0;
        while (true) {
            try {
                System.out.print(prompt + ": ");
                value = scanner.nextInt();
                scanner.nextLine();
                if (value < min) {
                    System.out.println("Number cannot be less than " + min + "\n");
                    continue;
                }
                if (value > max) {
                    System.out.println("Number cannot be larger than " + max + "\n");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid number\n");
                scanner.nextLine();
                continue;
            }
        }
        return value;
    }

    public static LocalDate getDate(Scanner scanner, String prompt) {
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("M/d/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("M-d-yyyy");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = null;
        while (true) {
            System.out.print(prompt + " [mm/dd/yyyy or yyyy-mm-dd]: ");
            String value = scanner.nextLine();
            try {
                date = LocalDate.parse(value, format1);
                break;
            } catch (DateTimeParseException e1) {
                try {
                    date = LocalDate.parse(value, format2);
                    break;
                } catch (DateTimeParseException e2) {
                    try {
                        date = LocalDate.parse(value, format3);
                        break;
                    } catch (DateTimeParseException e3) {
                        System.out.println("Invalid date format");
                        break;
                    }
                }
            }
        }
        return date;
    }

    //Final Project - Part 3, Write a method to get a double in the UserInput class.
    // Call that method to get the double from the user
    public static double getDouble(Scanner scanner, String prompt) {
        return getDouble(scanner, prompt, Double.MIN_VALUE, Double.MAX_VALUE);
    }

    public static double getDouble(Scanner scanner, String prompt, double min) {
        return getDouble(scanner, prompt, min, Double.MAX_VALUE);
    }

    public static double getDouble(Scanner scanner, String prompt, double min, double max) {
        double value = 0;
        while (true) {
            try {
                System.out.print(prompt + ": ");
                value = scanner.nextDouble();
                scanner.nextLine();
                if (value < min) {
                    System.out.println("Number cannot be less than " + min + "\n");
                    continue;
                }
                if (value > max) {
                    System.out.println("Number cannot be larger than " + max + "\n");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid number\n");
                scanner.nextLine();
                continue;
            }
        }
        return value;
    }

}
