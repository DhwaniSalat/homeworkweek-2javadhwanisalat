package homeworkweek2;

import java.util.Scanner;

/**
 * Write a Java program to print the area and perimeter of a rectangle.
 Test Data:
 * Width = 5.5 Height = 8.5
 *Expected Output:
 *Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

public class Programme14AreaPerimeterOfRectangle {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Width: ");
        double Width = obj.nextDouble();
        System.out.println("Enter Height: ");
        double Height = obj.nextDouble();
        double area = Width * Height;
        double perimeter = (Width + Height) * 2;
        System.out.println("Area is = " + area);
        System.out.println("Perimeter is = " + perimeter);

    }
}
