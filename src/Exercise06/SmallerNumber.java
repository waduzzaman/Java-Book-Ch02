package Exercise06;


//find out smaller number using if and using math class
import java.util.Scanner;
public class SmallerNumber {

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int number1 = input.nextInt();

        System.out.print("Enter 2nd number: ");
        int number2 = input.nextInt();

        System.out.print("Enter 3rd number: ");
        int number3 = input.nextInt();

        // smallest Number finding with if statement

        if (number1<number2 && number1<number3)
            System.out.print( "The smallest number is :"+ number1);

        if (number2<number1 && number2<number3)
            System.out.println("The smallest number is :"+number2);

        if (number3<number1 && number3<number2)
            System.out.println("The smallest number is :" +number2 );

        // Largest Number finding with if statement

        if (number1>number2 && number1>number3)
            System.out.println( "\n The Largest number is :"+ number1);

        if (number2>number1 && number2>number3)
            System.out.println("\n The largest number is :"+number2);

        if (number3>number1 && number3>number2)
            System.out.println("\n The largest number is :"+number3);


        /*
        smaller number finding with math
        int minimum = Math.min(Math.min(number1, number2), number3);

        System.out.print("The minimum of the numbers entered is "+minimum);
        */


        /*
        int smaller;
        if (x <= y && x <= z)
            min = x;
        if (y <= x && y <= z)
            min = y;
        if (z <= x && z <= y)
            min = z;

        System.out.println("Smallest number among " + x + ", " +
                y + " and " + z + " is: " + min)

        */


    }




}
