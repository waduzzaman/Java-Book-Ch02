package excercise3;

import java.util.Scanner;

// Chapter 2: Exercise 2.15:
//Write and application that ask the user to enter two integers, obtain them from
// user and prints their sum, product difference & quotient (division)
public class Arithmetic {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.print("Enter First number: ");//prompt
        int number1=input.nextInt ();//getting input from user/ read first number from the user
        System.out.print("Enter Second  number: ");
        int number2=input.nextInt();//getting input from user/ read second number from the user

        int sum =number1+number2; // adding two number
        System.out.printf("Sum of the two number is: %d%n", sum ); // display sum. %d is a placeholder

        int product =number1*number2; // adding two number
        System.out.printf("Product of the two number is: %d%n", product ); // display sum. %d is a placeholder

        int difference =number1-number2; // adding two number
        System.out.printf("Difference of the two number is: %d%n", difference ); // display sum. %d is a placeholder

        int quotient =number1/number2; // adding two number
        System.out.printf("Division of the two number is: %d%n", quotient ); // display sum. %d is a placeholder






    }

}
