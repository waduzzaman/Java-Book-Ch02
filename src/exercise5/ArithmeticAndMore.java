package exercise5;


import java.util.Scanner;

public class ArithmeticAndMore {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.print("Enter First number: ");//prompt
        int number1=input.nextInt ();//getting input from user/ read first number from the user
        System.out.print("Enter Second  number: ");
        int number2=input.nextInt();//getting input from user/ read second number from the user

        System.out.print("Enter third number: ");
        int number3=input.nextInt();//getting input from user/ read third  number from the user

        int sum =number1+number2+number3; // adding two number
        System.out.printf("Sum of the two number is: %d%n", sum ); // display sum. %d is a placeholder

        int product =number1*number2*number3; // adding two number
        System.out.printf("Product of the two number is: %d%n", product ); // display sum. %d is a placeholder

        int average =(number1+number2+number3)/3; // adding two number
        System.out.printf("Average of the two number is: %d%n", average ); // display sum. %d is a placeholder

        if (number1> number2 && number1> number3)
            System.out.println( "The Smallest number is: " +number1);




    }
}
