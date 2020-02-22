import java.util.*;
class C4E3{
    public static void main(String args[]){
        /*
        Chapter 1 - Exercise 2.19
        Write a program that prompts the user to enter three
        points, (x1, y1), (x2, y2), and (x3, y3), of a triangle then displays its area.
        The formula for computing the area of a triangle is*/

        double x1 = 33.7490, y1 = 84.3880;
        double x2 = 28.5383, y2 = 81.3792;
        double x3 = 32.0809, y3 = 81.0912;
        double x4 = 35.2271, y4 = 80.8431;
        final double RADIUS = 6371.01;

        x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);
        x3 = Math.toRadians(x3);
		y3 = Math.toRadians(y3);
		x4 = Math.toRadians(x4);
        y4 = Math.toRadians(y4);
        
        double d1 = RADIUS * Math.acos((Math.sin(x1) * Math.sin(x2)) + 
        (Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));

        double d2 = RADIUS * Math.acos((Math.sin(x2) * Math.sin(x3)) + 
        (Math.cos(x2) * Math.cos(x3) * Math.cos(y2 - y3)));

        double d3 = RADIUS * Math.acos((Math.sin(x3) * Math.sin(x4)) + 
        (Math.cos(x3) * Math.cos(x4) * Math.cos(y3 - y4)));

        double d4 = RADIUS * Math.acos((Math.sin(x4) * Math.sin(x1)) + 
        (Math.cos(x4) * Math.cos(x1) * Math.cos(y4 - y1)));

        double s1 = (d1 + d2 + d3)/2;
        double area1 = Math.pow((s1*(s1-d1)*(s1-d2)*(s1-d3)),0.5);
        double s2 = (d1 + d3 + d4)/2;
        double area2 = Math.pow((s2*(s2-d1)*(s2-d3)*(s2-d4)),0.5);
        System.out.println(d1+" "+d2+" "+d3+" "+d4);
        
        // Herons formula
        System.out.println("The area of between 4 cities is  "+ area1+area2 + "km^2");
    }
}

