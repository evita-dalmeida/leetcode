import java.util.Scanner;

public class C3E3LinearEq {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a, b, c, d, e, f: ");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    double d = sc.nextDouble();
    double e = sc.nextDouble();
    double f = sc.nextDouble();
    sc.close();
    cramer_rule(a, b, c, d, e, f);
  }

  private static void cramer_rule(double a, double b, double c, double d, double e, double f) {
    StringBuilder sb = new StringBuilder();
    double disc = a * d - b * c;
    if (disc != 0) {
      double x = (e * d - b * f) / disc;
      double y = (a * f - e * c) / disc;
      sb.append("x is " + x + " and y is " + y);
    } else {
      sb.append("The equation has no solution");
    }
    System.out.println(sb);
  }
}