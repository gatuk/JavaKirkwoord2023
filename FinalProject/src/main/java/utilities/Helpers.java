package utilities;

import data.Car;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Helpers {
    public static int getChoice(Scanner scanner, String[] strs) {
        for (int i = 0; i < strs.length; i++) {
            System.out.println((i + 1) + " " + strs[i]);
        }
        System.out.println((strs.length + 1) + " Exit");
        // Partner Assignment 5 code goes here
        return UserInput.getInt(scanner, "Choose an option 1-" + (strs.length + 1),
                1, strs.length + 1); // return the value chosen by the user
    }

    public static String printDate(LocalDate date) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String dateStr = date.format(format);
        return dateStr;
    }

    public static String printCurrency(double amt) {
        // stack overflow help with formatting currency
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(amt);

    }
    public static String printNumber(int amt) {
        //help with formatting numbers
        NumberFormat formatter = NumberFormat.getNumberInstance();
        return formatter.format(amt);

    }

    public static void pressEnterToContinue(Scanner scanner) {
        UserInput.getString(scanner, "Press enter to continue");
    }

    public static void printTableHeaderRow() {
        /*
         System.out.printf("%-36s\t%-18s\t%6s\t%-12s\t%6s%n",
         "Title","Publication Date","Pages","Best Seller","Price");
         */
          System.out.printf("%-30s\t%-45s\t%-20s\t%-15s\t%-20s\t%-20s\t%-24s\t%-30s\n",
                "Make",
                "Model",
                "Price",
                "Year",
                "Kilometer",
                "Seating_Capacity",
                "sale_date",
                "best_seller");

    }
    //Make,Model,Price,Year,Kilometer,Seating_Capacity,sale_date,best_seller

    public static void printObjectAsTableRow(Car car) {
        System.out.printf("%-30s\t%-45s\t%-20s\t%-15s\t%-20s\t%-20s\t%-24s\t%-30s\n",
                car.getMake(),
                car.getModel(),
                printCurrency(car.getPrice()),
                car.getYear(),
                printNumber(car.getKilometer()),
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
