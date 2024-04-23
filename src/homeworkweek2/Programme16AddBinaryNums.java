package homeworkweek2;

import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * Sum of two binary numbers: 101
 */

public class Programme16AddBinaryNums {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first binary number: ");
        String binary1 = scanner.next();

        System.out.println("Input second binary number: ");
        String binary2 = scanner.next();

        int decimal1 = Integer.parseInt(binary1, 2);
        int decimal2 = Integer.parseInt(binary2, 2);

        int sum = decimal1 + decimal2;
        String binaryString = Integer.toBinaryString(sum);

        System.out.println("sum of binary number: "+ binaryString);
    }
}
