// Created by: Zachary Maroney

package integrationProject;

/**
 * overloading the a method.
 * 
 * @author Zachary Maroney
 */
public class Sum {

  /**
   * Aum two int values.
   * 
   * @param x Any int value.
   * @param y Any int value.
   * @return the sum of the two values.
   */
  public int sum(int x, int y) {
    return (x + y);
  }

  /**
   * sum three int values.
   * 
   * @param x Any int value.
   * @param y Any int value.
   * @param z Any int value.
   * @return the sum of the three values.
   */
  public int sum(int x, int y, int z) {
    return (x + y + z);
  }

  /**
   * Sum two double values.
   * 
   * @param x Any double value.
   * @param y Any double value.
   * @return Sum of the two double values.
   */
  public double sum(double x, double y) {
    return (x + y);
  }
}
