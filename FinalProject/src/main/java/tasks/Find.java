package tasks;

import data.Car;
import data.CarDAO;
import utilities.Helpers;
import utilities.UserInput;

import java.util.ArrayList;
import java.util.Scanner;
public class Find implements TaskHandler {

    @Override
    public void handleTask(Scanner scanner) {
        while(true) {
            ArrayList<Car> cars = Helpers.cloneList(CarDAO.getCars());
            System.out.println("** Search **");
            String search = UserInput.getString(scanner, "Enter the maker of a car [Type ~ to Exit]");
            if(search.equals("~")) {
                break;
            }
            cars.removeIf((car -> !car.getMake().toLowerCase().contains(search.toLowerCase())));
            if(cars.size() == 0) {
                System.out.println("Your search matched no cars");
            } else {
                Helpers.printTableHeaderRow();
                for (Car car : cars) {
                    Helpers.printObjectAsTableRow(car);
                }
            }
            Helpers.pressEnterToContinue(scanner);
        } // end while loop
    }
}
