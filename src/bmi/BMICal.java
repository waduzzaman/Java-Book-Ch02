package bmi;

//Develop a BMI calculator
import java.util.Scanner;

public class BMICal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /**
        BMI Categories:
        Underweight = <18.5
        Normal weight = 18.5–24.9
        Overweight = 25–29.9
        Obesity = BMI of 30 or greater

        Develop a BMI calculator using Standard
        */

        System.out.print("Enter your weight in pound : ");
        int number1 = input.nextInt();

        System.out.print("Enter your height in inches : ");
        int number2 = input.nextInt();

        double bmi = (number1*703)/(number2*number2);

        System.out.println("Your BMI is : " +bmi);



        //Develop a BMI calculator using Metric
        /**
        BMI Categories:
        Underweight = <18.5
        Normal weight = 18.5–24.9
        Overweight = 25–29.9
        Obesity = BMI of 30 or greater
         */

        System.out.print("Enter your weight in kilogram : ");
        float number3 = input.nextFloat();

        System.out.print("Enter your height in meter : ");
        float number4 = input.nextFloat();

        float bmiMetric = (number3)/(number4*number4);

        System.out.println("Your BMI is : " +bmiMetric);

        if(bmiMetric < 18.5) {
            System.out.println("You are underweight");
        }else if (bmiMetric < 25) {
            System.out.println("You are normal");
        }else if (bmiMetric < 30) {
            System.out.println("You are overweight");
        }else {
            System.out.println("You are obese");
        }


    }
}
