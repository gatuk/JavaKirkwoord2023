package Assignment6;
import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //part 1B
        Fraction fraction1 = new Fraction();
        System.out.println(fraction1);
        Fraction fraction2 = new Fraction(27, 6);
        System.out.println(fraction2);
        System.out.println(fraction2.getNumerator());
        System.out.println(fraction2.getDenominator());
        //
        fraction2.setNumerator(30);
        fraction2.setDenominator(45);
        System.out.println(fraction2);
        try {
            Fraction fraction3 = new Fraction(3, 0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        //
        try {
            fraction2.setDenominator(0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        //4B

        System.out.println(Fraction.greatestCommonDivisor(75, 45));
        System.out.println(Fraction.greatestCommonDivisor(2, 4));
        System.out.println(Fraction.greatestCommonDivisor(5, 7));


        //Part 5B
        Fraction fraction4 = new Fraction(75, 45);
        System.out.println(fraction4.simplify());
        Fraction fraction5 = new Fraction(2, 4);
        System.out.println(fraction5.simplify());
//
        Fraction fraction6 = new Fraction(5, 7);
        System.out.println(fraction6.simplify());
        Fraction fraction7 = new Fraction(-2, 4);
        System.out.println(fraction7.simplify());
        Fraction fraction8 = new Fraction(2, -4);
        System.out.println(fraction8.simplify());
        Fraction fraction9 = new Fraction(-2, -4);
        System.out.println(fraction9.simplify());
//
        Fraction fraction10 = new Fraction(4, 1);
        System.out.println(fraction10.mixedNumber());
        Fraction fraction11 = new Fraction(0, 4);
        System.out.println(fraction11.mixedNumber());
        Fraction fraction12 = new Fraction(4, 4);
        System.out.println(fraction12.mixedNumber());
        Fraction fraction13 = new Fraction(8, 4);
        System.out.println(fraction13.mixedNumber());
        Fraction fraction14 = new Fraction(4, 8);
        System.out.println(fraction14.mixedNumber());
        Fraction fraction15 = new Fraction(13, 5);
        System.out.println(fraction15.mixedNumber());
        Fraction fraction16 = new Fraction(-13, 5);
        System.out.println(fraction16.mixedNumber());
        Fraction fraction17 = new Fraction(13, -5);
        System.out.println(fraction17.mixedNumber());
        Fraction fraction18 = new Fraction(-13, -5);
        System.out.println(fraction18.mixedNumber());
        Fraction fraction19 = new Fraction(-4, -5);
        System.out.println(fraction19.mixedNumber());


        //7B

        Fraction fraction20 = new Fraction(13, 5);
        Fraction fraction21 = new Fraction(4, 8);
        System.out.println(fraction20.add(fraction21));

        Fraction fraction22 = new Fraction(-13, -5);
        Fraction fraction23 = new Fraction(13, -5);
        System.out.println(fraction22.add(fraction23));


        /*
        In the Assignment4 class, write code that prompts the user for
        two fractions and adds them together. Use a try-catch statement
        when instantiating each Fraction object in case the user enters
        a 0 for either denominator.
         */
        // part 8
        try {
            System.out.println("Enter the numerator of the first fraction: ");
            int numerator1 = scanner.nextInt();
            System.out.println("Enter the denominator of the first fraction: ");
            int denominator1 = scanner.nextInt();
            System.out.println("Enter the numerator of the second fraction: ");
            int numerator2 = scanner.nextInt();
            System.out.println("Enter the denominator of the second fraction: ");
            int denominator2 = scanner.nextInt();
            Fraction fraction24 = new Fraction(numerator1, denominator1);
            Fraction fraction25 = new Fraction(numerator2, denominator2);
            System.out.println(fraction24.add(fraction25));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Extra Credit
        Fraction fraction24 = new Fraction(13, 5);
        Fraction fraction25 = new Fraction(4, 8);
        System.out.println(fraction24.subtract(fraction25));

        Fraction fraction26 = new Fraction(-13, -5);
        Fraction fraction27 = new Fraction(13, -5);
        System.out.println(fraction26.subtract(fraction27));

        Fraction fraction28 = new Fraction(13, 5);
        Fraction fraction29 = new Fraction(4, 8);
        System.out.println(fraction28.multiply(fraction29));

        Fraction fraction30 = new Fraction(-13, -5);
        Fraction fraction31 = new Fraction(13, -5);
        System.out.println(fraction30.multiply(fraction31));

        Fraction fraction32 = new Fraction(13, 5);
        Fraction fraction33 = new Fraction(4, 8);
        System.out.println(fraction32.divide(fraction33));
    }
}
