package Assignment5;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Helpers {
    public static String printDate(LocalDate date) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");
        String dateStr = date.format(format);
        return dateStr;
    }

    public static int getChoice(Scanner sc, String[] abc) {
        for (int i = 1; i <= abc.length; i++) {
            System.out.println(i + ") " + abc[i - 1]);
        }
        System.out.println((abc.length + 1) + ") " + "Exit");
        int choice = UserInput.getInt(sc,"Select an option 1 - " + (abc.length+1) + ": " , 1, (abc.length+1));
        return choice;
    }
}
// choice = Helpers.getChoice(scanner, options);
