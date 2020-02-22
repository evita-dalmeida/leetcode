import java.util.*;
class C2E19AreaOfTriangle{
    public static void main(String args[]){
        /*
        Chapter 1 - Exercise 2.19
        Write a program that prompts the user to enter three
        points, (x1, y1), (x2, y2), and (x3, y3), of a triangle then displays its area.
        The formula for computing the area of a triangle is*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate Area of a Triangle");
        System.out.println("Enter first point x1 and y1 : ");
        double x1 = sc.nextDouble(), y1 = sc.nextDouble();
        System.out.println("Enter second point x2 and y2 : ");
        double x2 = sc.nextDouble(), y2 = sc.nextDouble();
        System.out.println("Enter third point x3 and y3 : ");
        double x3 = sc.nextDouble(), y3 = sc.nextDouble();

        double side1 = Math.pow(Math.pow(x1-x2,2) + Math.pow(y1-y2,2),0.5);
        double side2 = Math.pow(Math.pow(x3-x2,2) + Math.pow(y3-y2,2),0.5);
        double side3 = Math.pow(Math.pow(x1-x3,2) + Math.pow(y1-y3,2),0.5);
        double s = (side1 + side2 + side3)/2;
        double area = Math.pow((s*(s-side1)*(s-side2)*(s-side3)),0.5);
        // Herons formula
        System.out.println("The area of the Triangle is "+ area);
        sc.close();
    }
}