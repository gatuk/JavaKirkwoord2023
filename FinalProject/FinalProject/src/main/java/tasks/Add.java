package tasks;

import data.Car;
import data.CarDAO;
import utilities.UserInput;

import java.time.LocalDate;
import java.util.Scanner;

public class Add implements TaskHandler {
    @Override
    public void handleTask(Scanner scanner) {
        // Make,Model,Price,Year,Kilometer,Seating_Capacity,sale_date,best_seller
        Car car = new Car();
        String make = UserInput.getString(scanner, "Enter the car's make");
        car.setMake(make);
        LocalDate saleDate= UserInput.getDate(scanner, "Enter car sale date");
        car.setSaleDate(saleDate);
        int kilometer = UserInput.getInt(scanner, "Enter car ID", 0);
        car.setKilometer(kilometer);
        boolean isBestSeller = UserInput.getBoolean(scanner, "Is this car best seller?");
        car.setBestSeller(isBestSeller);
        // Final Project - Part 3, Write a method to get a double in the UserInput class.
        // Call that method to get the double from the user
//        double price = UserInput.getDouble(scanner, "Enter the car's price");
//        car.setPrice(price);

        CarDAO.addCar(car);
        }
}

