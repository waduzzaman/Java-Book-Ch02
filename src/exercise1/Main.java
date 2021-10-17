
package exercise1;

import java.util.Scanner; //program uses class scanner. this is a java class library or
// Java application programming interfaceAPI


// My first Java Program. I am going to use Java Book's Chapter 02 examples.

// Every java program must have at least one class.

//public class are lower case. Main lower case.
// Class name starts with Capital letter and then each word thereafter also Capital letter
// like: ClassName
// its a CamelCase Convension

public class Main {

    public static void main(String[] args) {
	// Write a string line to see the output
        System.out.println("Welcome to Java Programming language.");

        // " " between the quotation is called String or String Character or String Literal\
        // between the parenthesis " " is call argument

        System.out.println("This is \n a \\multiline \n sentence for ");

        //display text with printf (formatted )

        System.out.printf ("%s%n%s%n", "Welcome to", "Java Programming !");
        // this methods has three arguments: "%s%n%s%n", "Welcome to", "Java Programming.
        // arguments are separated by coma
        // %s is a placeholder for string /
        //calling method and invoking method are the same thing
        //

        // Adding Numbers:
        // Getting input form the users for this we have to import a library

        //Create a scanner to obtain input from the command window
        Scanner input =new Scanner(System.in);
        System.out.print("Enter First number: ");//prompt
        int number1=input.nextInt ();//getting input from user/ read first number from the user
        System.out.print("Enter Second  number: ");
        int number2=input.nextInt();//getting input from user/ read second number from the user
        int sum =number1+number2; // adding two number
        System.out.printf("Sum of the two number is %d%n", sum ); // display sum. %d is a placeholder




    }



}
