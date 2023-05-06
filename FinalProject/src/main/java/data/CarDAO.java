package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CarDAO {
    public static ArrayList<Car> cars;
    private static final String FILE_PATH = "FinalProject/src/main/resources/";
    private static final String FILE_NAME = "car.csv";
    private static final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");

    public static void retrieveData() {
        if (cars == null) {
            try (Scanner fileScanner = new Scanner(new File(FILE_PATH + FILE_NAME))) {
                cars = new ArrayList<>();
                fileScanner.nextLine(); // read in the header line, but don't do anything with it
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    String[] data = line.split(","); // use a comma for CSV files or \t for TSV files
                    // get and set all data
                    //Make	Model	Price	Year	Kilometer	Seating Capacity	sale_date	best_seller
                    Car car = new Car();
                    car.setMake(data[0]);
                    car.setModel(data[1]);
                    car.setPrice(Double.parseDouble(data[2]));
                    car.setYear(Integer.parseInt(data[3]));
                    car.setKilometer(Integer.parseInt(data[4]));
                    car.setSeatCapacity(Integer.parseInt(data[5]));
                    car.setSaleDate(LocalDate.parse(data[6], dateFormat));
                    car.setBestSeller(Boolean.parseBoolean(data[7]));
                    cars.add(car);
                    //Make,Model,Price,Year,Kilometer,Seating_Capacity,sale_date,best_seller
                }
                Collections.sort(cars);
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
                throw new RuntimeException();
            }
        }
    }

    private static void writeData() {
        try(PrintWriter writer = new PrintWriter(new File(FILE_PATH + FILE_NAME))) {
            writer.println("Make\tModel\tPrice\tYear\tKilometer\tSeating_Capacity\tsale_date\tbest_seller");
            //Make,Model,Price,Year,Kilometer,Seating_Capacity,sale_date,best_seller
            //Make	Model	Price	Year	Kilometer	Seating_Capacity	sale_date	best_seller
            //writer.println("title\tauthor\tpublication_date\tnum_pages\tnytimes_best_seller\tlist_price");
            for(Car car : cars) {
                writer.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
                        car.getMake(),
                        car.getModel(),
                        car.getPrice(),
                        car.getYear(),
                        car.getKilometer(),
                        car.getSeatCapacity(),
                        car.getSaleDate().format(dateFormat),
                        Boolean.toString(car.isBestSeller()).toUpperCase()
                );
            }
        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
            
        }
    }

    public static ArrayList<Car> getCars() {
        return cars;
    }

    public static Car getCar(String make) {
        for(Car car : cars) {
            if(car.getMake().toUpperCase().equals(make.toUpperCase())) {
                return car;
            }
        }
        return null;
    }
    public static void addCar(Car car) {
        cars.add(car);
        writeData();
    }
    public static void updateCar(Car car) {
        cars.remove(car); // book dot update
        cars.add(car);
        writeData(); //update csve file
    }
    public static void deleteCar(Car car) {
        cars.remove(car); // book dot update
        writeData();
    }
}
