package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FinalProject {
    public static void main(String[] args) throws FileNotFoundException {
        //final project
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        outer:
        while (true) {
            System.out.println("select an option 1-7");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("list all the book");
                    break;
                case 2:
                    System.out.println("sort");
                    break;
                case 3:
                    System.out.println("search book");
                    break;
                case 4:
                    System.out.println("add book");
                    break;
                case 5:
                    System.out.println("update");
                    break;
                case 6:
                    System.out.println("delete");
                    break;
                default:
                    System.out.println("");
                    break outer;
            }
        }
        scanner.close();


        //parsing a CSV file into Scanner class constructor
        Scanner sc = new Scanner(new File("F:\\CSVDemo.csv"));
        sc.useDelimiter(",");   //sets the delimiter pattern
        while (sc.hasNext())  //returns a boolean value
        {
            System.out.print(sc.next());  //find and returns the next complete token from this scanner
        }
        sc.close();  //closes the scanner

    }
}
