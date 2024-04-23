package homeworkweek2;

import java.util.Scanner;

/**
 * Write a Java Program to print as below.
 * "+------------------------+"
 * "| |"
 * "| CORNER STORE |"
 * "| |"
 * "| 2015-03-29 04:38PM |"
 * "| |"
 * "| Gallons: 10.870 |"
 * "| Price/gallon: $ 2.089 |"
 * "| |"
 * "| Fuel total: $ 22.71 |"
 * "| |"
 * "+------------------------+"
 */
public class Programme20PrintProgramme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter title: ");//e.g CORNER STORE
        String title = scanner.nextLine();
        System.out.print("Enter date: ");//e.g 2015-03-29
        String date = scanner.nextLine();
        System.out.print("Enter time: ");//e.g 04:38
        String time = scanner.nextLine();
        System.out.println("Enter gallons value: ");//e.g 10.870
        double gValue = scanner.nextDouble();
        System.out.println("Enter gallons price: ");//e.g 2.089
        double gPrice= scanner.nextDouble();
        System.out.println("Enter fuel total: ");//e.g 22.71
        float fTotal = scanner.nextFloat();
        
        System.out.println("''+------------------------+''");
        System.out.println("''|                        |''");
        System.out.println("''|     " + title + "       |''");
        System.out.println("''|                        |''");
        System.out.println("''|  " + date + " " + time + "      |''");
        System.out.println("''|                        |''");
        System.out.println("''| Gallons:    " + gValue + "      |''");
        System.out.println("''| Price/gallon: " + "$ " + gPrice + "  |''");
        System.out.println("''|                        |''");
        System.out.println("''| Fuel total: " + "$ " + fTotal + "    |''");
        System.out.println("''|                        |''");
        System.out.println("''+------------------------+''");
    }

}
