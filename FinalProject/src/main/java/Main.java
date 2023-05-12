import data.Car;
import data.CarDAO;
import tasks.*;
import utilities.Helpers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CarDAO.retrieveData();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        String[] options = {
                "List all cars",
                "Sort the cars",
                "Find a car",
                "Add a car",
                "Update a car",
                "Remove a car"
        };
        outer: while(true) {
            System.out.println("** Main Menu **");
            choice = Helpers.getChoice(scanner,options);
            switch(choice) {
                case 1:
                    Helpers.printTableHeaderRow();
                    for(Car car : CarDAO.getCars()) {
                        Helpers.printObjectAsTableRow(car);
//                        System.out.println(car);
                    }
//                    Helpers.printArray(CarDAO.getCars());
                    break;
                case 2:
                    new Sort().handleTask(scanner);
                    break;
                case 3:
                    new Find().handleTask(scanner);

                    break;
                case 4:
                    new Add().handleTask(scanner);
                    break;
                case 5:
                    new Update().handleTask(scanner);
                    break;
                case 6:
                    new Remove().handleTask(scanner);
                    break;
                default:
                    break outer;
            } // end switch
            Helpers.pressEnterToContinue(scanner);
        } // end while loop
        System.out.println("Good bye!");
        scanner.close();
    } // end main method
}