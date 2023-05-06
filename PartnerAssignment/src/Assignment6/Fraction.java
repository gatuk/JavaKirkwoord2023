package Assignment6;
import java.math.BigInteger;

public class Fraction {

    //Create two int instance variables,
    // called numerator and denominator.
    //Part 1A
    private int numerator;
    private int denominator;

    //Create a default constructor.
    public Fraction() {
        numerator = 1;
        denominator = 1;
    }

    //part 2A
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    //In the Fraction class, modify the setDenominator method to
    // throw an IllegalArgumentException with the message
    // "Denominator cannot be zero", if the denominator is 0.
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
    }

    //part 4A
    public static int greatestCommonDivisor(int num1, int num2) {
        BigInteger b1 = BigInteger.valueOf(num1);
        BigInteger b2 = BigInteger.valueOf(num2);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();

    }//part %A

    /*
    In the Fraction class, create a method
    called "simplify" that has no parameters, and returns a Fraction object.
     */
    public Fraction simplify() {
        int gcd = greatestCommonDivisor(numerator, denominator);
        Fraction simpleifiedFraction = new Fraction(numerator / gcd, denominator / gcd);
        if (simpleifiedFraction.numerator >= 0 && simpleifiedFraction.denominator < 0) {
            simpleifiedFraction.numerator *= -1;
            simpleifiedFraction.denominator *= -1;
        } else if (simpleifiedFraction.numerator < 0 && simpleifiedFraction.denominator < 0) {
            simpleifiedFraction.numerator *= -1;
            simpleifiedFraction.denominator *= -1;
        }
        return simpleifiedFraction;
//// recursive implementation
//
//            if (denominator == 0) {
//                return numerator;
//            }
//            else {
//                return gcd(denominator, numerator % denominator);
//            }
    }


    //part 5A not done
    /*
    If the simplified fraction's numerator is greater than
    or equal to zero and the fraction's denominator is
     less than zero, reverse their negativity.
    For example, 1/-2 would become -1/2
     */
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    //part 6A
    /*
    In the Fraction class, create a method called
    "mixedNumber" that has no parameters, and returns a String.
    Inside this method, obtain the simplified version of the
    current Fraction object by calling the simplify method.
     */
    public String mixedNumber() {
        String result = "";
        Fraction simplified = simplify();
        if (simplified.denominator == 1) {
            return Integer.toString(simplified.numerator);
        } else if (simplified.numerator == 0) {
            return "0";
        } else if (Math.abs(simplified.numerator) > simplified.denominator) {
            int wholeNumber = simplified.numerator / simplified.denominator;
            int newNum = Math.abs(simplified.numerator % simplified.denominator);
            if (wholeNumber != 0) {
                result = wholeNumber + " " + newNum + "/" + simplified.denominator;
            }

        } else {
            result = simplified.numerator + "/" + simplified.denominator;
        }
        return result;

    }


    //part 7A
    /*
    In the Fraction class, create a method called "add" that has one
    Fraction parameter, called "other", and returns a String.
    This method adds this Fraction to the other Fraction parameter.
     */
    public String add(Fraction other) {
        int num = this.numerator * other.denominator +
                this.denominator * other.numerator;
        int den = this.denominator * other.denominator;
        Fraction sum = new Fraction(num, den);
        return "(" + this.mixedNumber() + ") + (" + other.mixedNumber() + ") = (" + sum.mixedNumber() + ")";
    }

    //part extra credits
    /*
    Add a method to subtract, multiply, and divide fractions.
    In Part 8, after the user enters both fractions,
    prompt them to add, subtract, multiply, or divide.
     */
    public String subtract(Fraction other) {
        int num = this.numerator * other.denominator -
                this.denominator * other.numerator;
        int den = this.denominator * other.denominator;
        Fraction dif = new Fraction(num, den);
        return "(" + this.mixedNumber() + ") - (" + other.mixedNumber() + ") = (" + dif.mixedNumber() + ")";
    }

    public String multiply(Fraction other) {
        int num =this.numerator * other.numerator;
        int den = this.denominator * other.denominator;
        Fraction pro = new Fraction(num, den);
        return "(" + this.mixedNumber() + ") * (" + other.mixedNumber() + ") = (" + pro.mixedNumber() + ")";
    }

    public String divide(Fraction other) {
        int num = this.numerator * other.denominator;
        int den = this.denominator * other.numerator;
        Fraction quo = new Fraction(num, den);
        return "(" + this.mixedNumber() + ") / (" + other.mixedNumber() + ") = (" + quo.mixedNumber() + ")";
    }

}
