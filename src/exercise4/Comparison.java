package exercise4;


//Chapter02. Ex2.16
//Write an application that ask the user to enter two integers, obtain them from the user and display the larger
// number followed by the words "is larger". if the numbers are equal print the message "These numbers are equal.

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1= input.nextInt();
        System.out.print("Enter second number: ");
        int number2= input.nextInt();
        if (number1==number2)
            System.out.printf("These numbers are equal");

       if (number1 > number2)
           System.out.print("number1 is Larger");

       if (number2 > number1)
            System.out.print("number2 is Larger");




    }

}
