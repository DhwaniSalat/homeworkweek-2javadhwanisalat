package homeworkweek2;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */

public class Programme6AreaOfCircle {

    public static void main(String[] args) {
        System.out.println("enter any radius value");
        Scanner obj = new Scanner(System.in);
        double pi = 3.14;
        double r = obj.nextDouble();
        double ans = pi * r * r;
        System.out.println("area of circle= "+ ans);

    }
}
