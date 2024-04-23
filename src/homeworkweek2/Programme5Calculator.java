package homeworkweek2;

import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */

public class Programme5Calculator {

    public void addition (int a,int b){
        int ans = a+b;
        System.out.println("addition of " + a + " and " + "=" + ans);
    }
    public void subtraction(int a, int b){
        int ans = a-b;
        System.out.println("subtraction of " + a + " and " + "=" +ans);
    }
    public static void multiplication(int a, int b){
        int ans = a*b;
        System.out.println("multiplication of " + a + " and " + "=" +ans);
    }
    public static void division(int a, int b){
        int ans = a/b;
        System.out.println("division of " + a + " and " + "=" +ans);
    }

    public static void main(String[] args) {
        System.out.println("enter first number");
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        System.out.println("enter second number");
        int b = obj.nextInt();

        Programme5Calculator obj1 = new Programme5Calculator();
        obj1.addition(a,b);
        obj1.subtraction(a,b);

        multiplication(a,b);
        division(a,b);

    }



}
