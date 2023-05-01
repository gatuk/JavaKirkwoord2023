package utilities;

import data.Car;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Helpers {
    public static int getChoice(Scanner scanner, String[] strs) {
        for (int i = 0; i < strs.length; i++) {
            System.out.println((i + 1) + " " + strs[i]);
        }
        // Partner Assignment 5 code goes here
        return UserInput.getInt(scanner, "Choose an option 1-" + (strs.length + 1),
                1, strs.length + 1); // return the value chosen by the user
    }

    public static String printDate(LocalDate date) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String dateStr = date.format(format);
        return dateStr;
    }

    public static void pressEnterToContinue(Scanner scanner) {
        UserInput.getString(scanner, "Press enter to continue");
    }

    public static void printTableHeaderRow() {
        /*
         System.out.printf("%-36s\t%-18s\t%6s\t%-12s\t%6s%n",
         "Title","Publication Date","Pages","Best Seller","Price");
         */
        System.out.printf("%-36s\t%-36s\t%-6s\t%16s\t%14s\t%20s\t%12s\t%18s%n",
                "Make", "Model", "Price", "Year", "Kilometer", "Seating_Capacity", "sale_date", "best_seller");

    }
    //Make,Model,Price,Year,Kilometer,Seating_Capacity,sale_date,best_seller

    public static void printObjectAsTableRow(Car car) {
        System.out.printf("%-36s\t" +
                        "%-36s\t" +
                        "%-6.2f\t" +
                        "%12d\t" +
                        "%12d\t" +
                        "%10d\t" +
                        "%30s\t" +
                        "%12s%n",
                car.getMake(),
                car.getModel(),
                car.getPrice(),
                car.getYear(),
                car.getKilometer(),
                car.getSeatCapacity(),
                printDate(car.getSaleDate()),
                car.isBestSeller() ? "Yes" : "No");
        }

//    public static void printArray(ArrayList<Car> cars) {
//        for (Car car : cars) {
//            System.out.println(car);
//            //  "Make", "Model", "Price", "Year", "Kilometer", "Seating_Capacity", "sale_date", "best_seller");
//            System.out.println("car  Make: " + car.getMake());
//            System.out.println("car  Model: " + car.getModel());
//            System.out.println("car  Price: " + car.getPrice());
//            System.out.println("car  Year: " + car.getYear());
//            System.out.println("car  Kilometer: " + car.getKilometer());
//            System.out.println("car  Seating_Capacity: " + car.getSeatCapacity());
//            System.out.println("car  sale_date: " + car.getSaleDate());
//            System.out.println("car  best_seller: " + car.isBestSeller());
//
//        }
//    }
    // https://stackoverflow.com/a/715660
    public static ArrayList<Car> cloneList(ArrayList<Car> list) {
        ArrayList<Car> clone = new ArrayList<>(list.size());
        for (Car item : list) {
            try {
                clone.add((Car)item.clone());
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }
        return clone;
    }
}
