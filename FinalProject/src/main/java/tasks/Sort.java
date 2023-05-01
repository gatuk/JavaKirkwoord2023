package tasks;

import data.Car;
import data.CarDAO;
import utilities.Helpers;

import java.util.ArrayList;
import java.util.Scanner;

public class Sort implements TaskHandler{
    public void handleTask(Scanner scanner) {
        ArrayList<Car> cars = CarDAO.getCars();
        //Make,Model,Price,Year,Kilometer,Seating_Capacity,sale_date,best_seller
        int choice = 0;
        String[] options = {
                "Make, A to Z",
                "Make, Z to A",
                "Sale Date, old to new",
                "Sale Date, new to old",
                "Price, low to high",
                "Price, high to low",
                "Kilometer driven, low to high",
                "Kilometer, high driven to low"
        };
        outer: while(true) {
            System.out.println("** Sort Menu **");
            choice = Helpers.getChoice(scanner,options);
            switch(choice) {
                case 1:
//                    "Make, A to Z",
                    cars.sort((a, b) -> a.getMake().compareTo(b.getMake()));
                    break;
                case 2:
//                    "Make, Z to A",
                    cars.sort((a, b) -> a.getMake().compareTo(b.getMake())*-1);
                    break;
                case 3:
//                    "Sale Date, old to new",
                    cars.sort((a, b) -> a.getSaleDate().compareTo(b.getSaleDate()));
                    break;
                case 4:
//                    "Sale Date, new to old"
                    cars.sort((a, b) -> a.getSaleDate().compareTo(b.getSaleDate()) * -1);
                    break;
                case 5:
//                    "Price, low to high",
                    cars.sort((a, b) -> (int) (a.getPrice()-b.getPrice()));
                    break;
                case 6:
//                    "Price, high to low",
                    cars.sort((a, b) -> (int) (a.getPrice()-b.getPrice()) * -1);
                    break;
                case 7:
//                    "Kilometer Driven, low to high
                    cars.sort((a, b) -> (int) (a.getKilometer()-b.getKilometer()));
                    break;
                case 8:
//                    "Kilometer Driven, high to low"
                    cars.sort((a, b) -> (int) (a.getKilometer()-b.getKilometer()) * -1);
                    break;
                default:
                    break outer;
            } // end switch
            Helpers.printTableHeaderRow();
            for(Car car : cars) {
                Helpers.printObjectAsTableRow(car);
            }
            Helpers.pressEnterToContinue(scanner);
        } // end while loop
    }
}
