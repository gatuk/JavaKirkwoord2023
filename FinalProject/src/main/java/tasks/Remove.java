package tasks;

import data.Car;
import data.CarDAO;
import utilities.Helpers;
import utilities.UserInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Remove implements TaskHandler {
    @Override
    public void handleTask(Scanner scanner) {
        boolean flag = false;
        while (!flag) {
            try {
                String kilometer = UserInput.getString(scanner, "Enter kilometer driven");
                int kilometerDriven = Integer.parseInt(kilometer);
                List<Car> cars = CarDAO.getCars();
                int counter = 0;

                for (Car carMile : cars) {
                    if (carMile.getKilometer() == kilometerDriven) {
                        break;
                    }
                    counter++;
                }
                cars.remove(counter);
                flag = true;
                CarDAO.setCars((ArrayList<Car>) cars);
                CarDAO.writeData();
                Helpers.pressEnterToContinue(scanner);
            } catch (Exception e) {
                System.out.println("Could not find car to be removed");
            }
        }
    }
}
