package tasks;

import data.Car;
import data.CarDAO;
import utilities.Helpers;
import utilities.UserInput;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Update implements TaskHandler {
    @Override
    public void handleTask(Scanner scanner) {
        boolean flag = false;
        try {
            while (!flag) {
                Car carUpdate = null;
                String kilometerDriven = UserInput.getString(scanner, "Enter kilometer driven");
                int kilometer = Integer.parseInt(kilometerDriven);
                ArrayList<Car> cars = CarDAO.getCars();
                for (Car car : CarDAO.cars) {
                    if (car.getKilometer() == kilometer) {
                        carUpdate = car;
                        break;
                    }
                }
                if (carUpdate == null) {
                    throw new RuntimeException();
                }
                String make = UserInput.getString(scanner, "Enter car make");
                if (!make.equals("")) {
                    carUpdate.setMake(make);
                }
                LocalDate saleDate = UserInput.getDate(scanner, "Enter sale date");
                if (saleDate != null) {
                    carUpdate.setSaleDate(saleDate);
                }

                boolean bestseller = UserInput.getBoolean(scanner, "Is this car best seller?");
                carUpdate.setBestSeller(bestseller);
                String capacity = UserInput.getString(scanner, "Enter seat capacity");
                if (!capacity.equals(""))
                {
                    carUpdate.setSeatCapacity(Integer.parseInt(capacity));
                }
                String model = UserInput.getString(scanner, "Enter car model");
                if (!model.equals("")) {
                    carUpdate.setModel(model);
                }
                double price = UserInput.getDouble(scanner, "Enter car price");
                if (price != 0.0) {
                    carUpdate.setPrice(price);
                }
                CarDAO.setCars(cars);
                CarDAO.writeData();
                flag = true;
                Helpers.pressEnterToContinue(scanner);
            }
        } catch (Exception e) {
            System.out.println("car not found to be updated.");
//            System.out.println(e.getMessage());
        }

    }
}
