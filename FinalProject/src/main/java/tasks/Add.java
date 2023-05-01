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
        String model = UserInput.getString(scanner, "Enter the car's model");
        car.setModel(model);
        double price = UserInput.getDouble(scanner, "Enter the car's price");
        car.setPrice(price);
        int year = UserInput.getInt(scanner, "Enter the car's year", 0);
        car.setYear(year);
        int kilometer = UserInput.getInt(scanner, "Enter the car's kilometer", 0);
        car.setKilometer(kilometer);
        int seatingCapacity = UserInput.getInt(scanner, "Enter the car's seating capacity", 0);
        car.setSeatCapacity(seatingCapacity);
        LocalDate saleDate = UserInput.getDate(scanner, "Enter car sale date");
        car.setSaleDate(saleDate);
        boolean isBestSeller = UserInput.getBoolean(scanner, "Is this car best seller?");
        car.setBestSeller(isBestSeller);
        CarDAO.addCar(car);


        // Final Project - Part 3, Write a method to get a double in the UserInput class.
        // Call that method to get the double from the user
//        price = UserInput.getDouble(scanner, "Enter the car's price");
//        car.setPrice(price);
        // Already included in line 19 and 20 above

    }
}




