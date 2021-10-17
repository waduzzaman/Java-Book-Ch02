package exercise7;

//Find the Diameter, circumferences and area of a circle

import java.util.Scanner;
import java.lang.Math;

public class Circle {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius of a circle: ");
        int r= input.nextInt();

        int diameter=2*r;
        System.out.println("The diameter of a circle is :" +diameter);

        double circumference = 2* Math.PI*r;
        System.out.println("The circumference of the circle is :" + circumference);

        double area =Math.PI*r*r;

        System.out.println("The area  of the circle is :" + area);



    }
}
