import java.util.Scanner;

public class assigment2part1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextDouble()){
            double num = scanner.nextDouble();
            if(num%2==0) {
                System.out.println("Even");
            }else {
                System.out.println("Odd");
            }
        }else {
            System.out.println("Not a number");
        }

    }
}
