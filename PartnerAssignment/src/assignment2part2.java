import java.util.Scanner;

public class assignment2part2 {
    public static void main(String[] args) {
        Scanner scanner=  new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int uInput = scanner.nextInt();

        int days = uInput / (60 * 60 * 24);
        int daysRem = uInput % (60 * 60 * 24);
        int hours = daysRem / (60 * 60);
        int hoursRem = daysRem % (60 * 60);
        int minutes = hoursRem / 60;
        int seconds = hoursRem % 60;

//        System.out.println("Days: " + days);
//        System.out.println("Hours: " + hours);
//        System.out.println("Minutes: " + minutes);
//        System.out.println("Seconds: " + seconds);

        String result = days >1 ? "s" : "";
        String result1 = hours >1 ? "s" : "";
        String result2 = minutes >1 ? "s" : "";
        String result3 = seconds >1 ? "s" : "";
        System.out.printf("%s day%s \n", days, result);
        System.out.printf("%s hour%s \n", hours, result1);
        System.out.printf("%s minute%s \n", minutes, result2);
        System.out.printf("%s second%s \n", seconds, result3);







    }
}
