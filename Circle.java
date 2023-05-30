import java.util.*;

public class Circle {
  final double pi = 3.14;
  int r;
  double area;
  double circumference;

  void setRadius() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter  radius");
    r = sc.nextInt();
  }

  void findArea() {
    double area = pi * r * r;
    System.out.println("area is:" + area);
  }

  void findCircumference() {
    double circumference = 2 * pi * r;
    System.out.println("Circumference is:" + circumference);
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Circle1 c1 = new Circle1();
    c1.setRadius();
    c1.findArea();
    c1.findCircumference();
  }
}
