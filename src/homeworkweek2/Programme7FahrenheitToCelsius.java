package homeworkweek2;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Programme7FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("insert any temperature in Fahrenheit");
        double f = obj.nextDouble();
        double celsius = (f - 32 )*  5/9;
        System.out.println("degree fahrenheit value convert into celsius is " + celsius);
    }
    }

