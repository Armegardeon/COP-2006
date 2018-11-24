// Created by: Zachary Maroney

package integrationProject;

public class Sum { // overloading the a method
  public int sum(int x, int y) {
    return (x + y);
  }

  public int sum(int x, int y, int z) {
    return (x + y + z);
  }

  public double sum(double x, double y) {
    return (x + y);
  }

  public static void main(String args[]) {
    Sum sm = new Sum();
    System.out.println(sm.sum(10, 20));
    System.out.println(sm.sum(10, 20, 30));
    System.out.println(sm.sum(10.5, 20.5));
  }
}
