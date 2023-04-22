import java.util.Scanner;

public class AssignmentPart1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        double num1 = sc.nextDouble();
        System.out.println("Enter another number: ");
        double num2 = sc.nextDouble();
        double largest;
        if (num1 > num2) {
            largest = num1;
        } else {
            largest = num2;
        }
        System.out.println("largest = " + largest);
    }
    //   repo update  test

}

