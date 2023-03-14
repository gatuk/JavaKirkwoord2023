# JavaKirkwoord2023

### Reflection week 3 and 4
### Instructions

In your README.md file, write a short reflection (80-160 words) about what you learned or
already knew from the last two weeks of class. Use markdown to create a heading and to format text.
#### Week3:
In week 3, we learned about for loop. A for loop is best used when you know the number of iterations ahead of time. It has initialization, test condition, and increment statements.  We also learned to how convert integers to strings and vice versa using Integer.toString(int value) and Integer.parseInt(String value) respectively.  We also covered string methods such as length, toUppercase and toLowerCase.

We also touch on static and not static methods and variables. For static methods, you don’t need to instance of the class. For example, Integer.toString don’t require to create instance of Integer class to call toString method.  Static variables are, essentially, global variables. All instances of the class share the same static variable.

However, non-Static Variables and methods requires instance of the class. For example, Car mycar/yourCar = new Car (). Car is a non-static class and myCar and yourCar are reference variable that refer to specific instance of the Car class.

We also learned about Scanner class which is used to provide standard input from keyboard by user supply input value. Scanner console = new Scanner (System.in).  Since are creating object of scanner class, it is non-static.

#### Week4:
In week 4, we learned how equals () method and == operator is used to compare two objects in Java. For example, if s1= “Hello” and s2= s1.  
The equal () method used to compare the content of the two string s1 and s2. In other words, are s1 and s2 contain the same content. Whereas == operator is used for reference or address comparison. Are s1 and s2 point to the same address.
For example, String s1= "Bob"; String s2 =s1; String s3= new String ("Bob") ;

1.	System.out.println(s1 == s2); // true
2.	System.out.println(s1 == s3); // false
3.	System.out.println(s1. equals(s2)); // true
4.	System.out.println(s1. equals(s3)); // true

In #1 both s1 and s2 point the same memory address. But in #2 we created new string s3. S1 and s3 point to the different memory address. However, in #3 and #4, we are comping the content of s1 and s2 and s1 and s3 respectively. All the three variables (s1, s2 and s3) have the same content “Bob” and that why #1, #2 and #3 return true.
We also revisited the for loop we covered in week3 and combined with if clause to get more fine-tuning.

```
for (int i = 0; i <= 10; i++) {
if (i % 2 == 0){
System.out.print(" is even");
} else {
System.out.print(" is odd");
}
System.out.println();
}
```

We also covered short evaluation of OR /AND operators. Short-circuiting using AND (&&) operator evaluate to false if the first condition is false. But if the condition true, it forced to evaluate the second condition.  However, short-circuiting using OR (||) operator evaluate to true if the first condition is true. But if the first condition is evaluated to false, it forced test the second condition.

#### Type casting:
Casting is a way of converting data from one data type to another data type. In Java, you can cast both reference and primitive data types.  When we assign value of a smaller data type to a bigger data type, it is called implicit casting or widening. For example, from int to double (3 to 3.0).
But if we want to assign a value of larger data type to a smaller data type, we perform explicit type casting or narrowing. For example, from double to int (3.9 to 3) and some data is lost.
#### Using random class:
Random numbers within a specific range of type integer, float and double can be generated in Java using Random rand = new Random ().  For example, using (int) (Math. Random () * 6) + 1, we can generate random rolling of a dice between 1 &6.


// chapter 1  and

## week 3 and 4
This paragraph
this another paragraph
// hyperlink
// underscore
// inline `dfdfd`
```Java
//this is pargah
//this andor

```
// bullet list use dash or *
// min 8 words


// codeGym task week 3
// if() and else
// conditional operator

## Reflection on Weeks 5 and 6
### Distinction between while loop
The while loop executes statements after testing loop condition whereas the do-while loop tests the loop condition after completing first iteration.
The do-while loop guarantees at least one execution.
For example:
```
Int i=3. 
 while (i< 3) {
 System.out.println("Iteration: "+ ++i);
      }
do {
         System.out.println("Iteration: "+ ++i);
      } while (i < 3);
```
### In class GuessThe number example:
In this example Instructor used while loop in conjunction with break statement.
We randomly generated a random number between 65 & 90 using randomNumber = random.nextInt(max + 1 - min) + min.
Then, we converted the randomly generated number to the corresponding character using answer= answer = (char)randomNumber + " ".  
Then we tested the answer against the used guess. If the used guess equals answer,
```
if(guess.equalsIgnoreCase(answer))  break; 
```
We used compareTo method to guide to go higher or lower in their next guess if their current guess is higher or lower than randomly generated answer.
```  
if(guess.compareToIgnoreCase(answer) > 0) {
    System.out.print("Guess lower: ");
} else {
    System.out.print("Guess higher: ");
}
```
We also learned how try and catch block can used to handle exceptions in java.
```
try {
// Block of code that cause exception or error
}
catch (Exception e) {
// Block of code to handle errors
}
```
We also learned distinction between break and continue statement in java.

```
for (int i = 0; i < 10; i++) {
    if (i ==5) {
        break;
    }
    System.out.println(i);// print 0,1,2,3,4 and break out of loop when i reach 5 
}

for (int i = 0; i < 10; i++) {
  if (i %2==0) {
    continue.
  }
  System.out.println(i);// skip even numbers and print 1,3,5,7,9. 
}
```
We also learned distinction between == operator and equals and equalsIgnoreCase.
The == operator compare reference but equals or equalsignorecase methods compare the contents.
So, always use equals or equalsignorecase methods when comparing strings.

```
String s1= "bob ";
String s2= "Allen";
String s3= s1 + s2;
String s4= "bob" + " " + "Allen";
System.out.println(s3);// bob Allen
System.out.println(s4); // bob Allen

System.out.println(s3==s4);// false 
System.out.println(s3.equals(s4));// true

```

### If-else and switch logic.
The if-else check for range of conditions and each condition must be valid Boolean expression.
The flow of execution only goes to one of the block and rest of the block. The switch statement examines single value and compare it to multiple possibilities.
Then you can control the flow execution when the two values match. Within switch code block, you can have one or more cases.

```
int season = 3;
if (season == 1)
{
    System.out.println("season 1");
}
else if(season == 2)
{
    System.out.println("season 2");
}
else if(season == 3)
{
    System.out.println("season 3");
}
else{
    System.out.println("Invalid season");
}
switch(season)
{
    case 1:
        System.out.println("season 1");
        break;
    case 2:
        System.out.println("season 2");
        break;
    case 3:
        System.out.println("season 3");
        break;
    default:
        System.out.println("Invalid season");
        break;
}
```
#### switch expression & regular switch logic.
The switch expression more efficient than regular switch logic. Check out this link.

[This is an external link to docs.oracle.com](https://docs.oracle.com/en/java/javase/13/language/switch-expressions.html)


## Reflection Weeks 7 and 8
we discussed the difference between java arrays and python lists. Array is created using the following syntax 
```
String[] usStates= {"California", "Alabama","Alaska","Arizona","Arkansas","Colorado","Connecticut"}
```
Java arrays holds a fixed number of values of similar data type and accessed using indexing. For example,
```
System.out.println(usStates[2]); // Alaska
System.out.println(usStates[usStates.length - 1]); // Connecticut
```
You can loop through arrays using regular for lop or enhanced for loop. 
```
for(int i = 0; i <usStates.length; i++) {
System.out.print(usStates[i] + " ");
}
for(String state: usStates) {
System.out.println(state);
}
```
Array can be sorted using several sorting algorithms. In class, we covered Quicksort being an efficient one. 
```
Arrays.sort(usStates);
```
A java sort an array of Strings in Alphabetical Order. // Alabama, Alaska, Arizona, Arkansas, California, Colorado, Connecticut"}

In class, we covered how we can generate random numbers using between two numbers eg. min and max and assign that number to randomNum. For example, 
```
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
public static int randomNumber(int min, int max) {
int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
return randomNum;
}
```
### Partner Assignment3
In this assignment we used switch statement in conjunction with conditional (ternary) operator and 
DateTimeFormatter. We also used try and catch to make sure valid date was entered.
structure conditional (ternary) operator: 
```
condition ? exprIfTrue : exprIfFalse
const age = 26;
const drink = age >= 21 ? "Beer" : "Juice";
console.log(drink); // "Beer"
```
The following one particular pattern of DateTimeFormatter: 
```
DateTimeFormatter formatter1 =
DateTimeFormatter.ofPattern("M/d/yyyy");
```
Pattern of switch statement. In this example we are switching on date.getMonthValue() value. 
``` 
switch (date.getMonthValue()) {
case 1:
sign = (date.getDayOfMonth() < 20) ? ("Capricorn") : ("Aquarius");
break;
```
The code below represent pattern of try and catch block. If the date inside try block is not valid, 
the code will jump to catch block and "Invalid date" error will be displaced on the screen. 
```
try {
date = LocalDate.parse(value, formatter1);
} catch (DateTimeParseException e1) {
System.out.println("Invalid date");
}
```
In switch statement it easy to forget break statement and cause fallthrough. However, this can be prevented
using enhanced switch statement, which is also more succinct. Partner Assignment3 can be rewritten in the following ways. 

```
String sign = null;
date.getDayOfMonth(); 
switch (date.getMonthValue()) { 
case 1 -> sign = (date.getDayOfMonth() < 20) ? ("Capricorn") : ("Aquarius");
case 2 -> sign = (date.getDayOfMonth() < 19) ? ("Aquarius") : ("Pisces");
case 3 -> sign = (date.getDayOfMonth() < 21) ? ("Pisces") : ("Aries");
case 4 -> sign = (date.getDayOfMonth() < 20) ? ("Aries") : ("Taurus");
case 5 -> sign = (date.getDayOfMonth() < 20) ? ("Aries") : ("Gemini");
case 6 -> sign = (date.getDayOfMonth() < 20) ? ("Gemini") : ("Cancer");
case 7 -> sign = (date.getDayOfMonth() < 23) ? ("Cancer") : ("Leo");
case 8 -> sign = (date.getDayOfMonth() < 23) ? ("Leo") : ("Virgo");
case 9 -> sign = (date.getDayOfMonth() < 23) ? ("Virgo") : ("Libra");
case 10 -> sign = (date.getDayOfMonth() < 23) ? ("Libra") : ("Scorpio");
case 11 -> sign = (date.getDayOfMonth() < 22) ? ("Scorpio") : ("Sagittarius");
case 12 -> sign = (date.getDayOfMonth() < 22) ? ("Sagittarius") : ("Capricorn");

}
```










