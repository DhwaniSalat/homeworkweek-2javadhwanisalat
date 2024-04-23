package homeworkweek2;

import java.util.Scanner;

/**
 * 10. Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 * Test Data: Input a number: 8
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 */

public class Programme10MultiplicationTable {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter any value: ");
        int value = obj.nextInt();

            System.out.println(value + " * 1 " + " = " + value * 1);
            System.out.println(value + " * 2 " + " = " + value * 2);
            System.out.println(value + " * 3 " + " = " + value * 3);
            System.out.println(value + " * 4 " + " = " + value * 4);
            System.out.println(value + " * 5 " + " = " + value * 5);
            System.out.println(value + " * 6 " + " = " + value * 6);
            System.out.println(value + " * 7 " + " = " + value * 7);
            System.out.println(value + " * 8 " + " = " + value * 8);
            System.out.println(value + " * 9 " + " = " + value * 9);
            System.out.println(value + " * 10" + " = " + value * 10);
    }

    }

