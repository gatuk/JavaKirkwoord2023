# JavaKirkwoord2023
### You Feedback:
* Please add "mlhaus" as a collaborator on your GitHub project. 
* There are two usernames I received but have no idea who they are: zico2022 and PrivateCaller.
##### Answer 
1. I added you as my collaborator and changed username from zico2022 to gatuk so that you don’t get confused. 
2. I don’t have username PrivateCaller and I don’t why it shows it as my username when you viewed my GitHub account. 
3. I also added block level mark up using backticks after getting feedback from you on the Slack channel. 
Then I made correction and showed to you before class stated. In your class website, it shows the grade hasn’t been updated after I made corrections. 
Can you please update the grade?

# Reflection week 3 and 4
#### Instructions

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






<<<<<<< HEAD
||||||| 03f8b67
I added you as my collaborator and changed username from zico2022 to gatuk so that you don’t get confused. 
I don’t have username PrivateCaller and I don’t why it shows it as my username when you view my GitHub account.
=======
I added you as my collaborator and changed username from zico2022 to gatuk so that you don’t get confused. 
I don’t have username PrivateCaller and I don’t why it shows it as my username when you view my GitHub account.
// chapter 1  and

## week 3 and 4
This paragraph
this another paragraph
// hyperlink
// underscore
// inline `dfdfd`
```Java
this is pargah
this andor

```
// bullet list use dash or *
// min 8 words


// codeGym task week 3
// if() and else 
// conditional operator 
>>>>>>> 80df5d2a5a625f5bc29b3f12212fb79d598fdac7
