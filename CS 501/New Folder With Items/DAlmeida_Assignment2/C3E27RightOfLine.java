import java.util.Scanner;

public class C3E27RightOfLine {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a point x and y coordinate: ");
    double px = sc.nextDouble();
    double py = sc.nextDouble();

    sc.close();

    boolean a = isInsideTriangle(0, 0, 0, 100, px, py);
    boolean c = isInsideTriangle(200, 0, 0, 0, px, py);
    boolean b = isInsideTriangle(0, 100, 200, 0, px, py);
    
    if (a && b && c)
        System.out.println("The point is in the triangle");
    else
        System.out.println("The point is not in the triangle");

  }

  private static boolean isInsideTriangle(double x1, double y1, double x2, double y2, double px, double py) {
    double res = (x2 - x1) * (py - y1) - (px - x1) * (y2 - y1);  
    if (res>0)
        return false;
    return true;
  }
}