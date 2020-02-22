import java.util.Scanner;
class C2E15DistanceBtwTwoPoints{
    public static void main(String args[]){
        /*
        Chapter 1 - Exercise 2.15
        Write a program that prompts the user to enter
        two points (x1, y1) and (x2, y2) and displays their distance.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate Distance between two points: ");
        System.out.println("Please enter two points ");

        System.out.println("Enter first point x1 and y1 : ");
        double x1 = sc.nextDouble(), y1 = sc.nextDouble();
        System.out.println("Enter second point x2 and y2 : ");
        double x2 = sc.nextDouble(), y2 = sc.nextDouble();
        double distance = Math.pow((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)), 0.5);
        System.out.println("The distance between the two points is " + distance);
        sc.close();
    }
}