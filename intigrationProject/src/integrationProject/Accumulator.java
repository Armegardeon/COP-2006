// Created by: Zachary Maroney

package integrationProject;

public class Accumulator {
  /**
   * Gets the sum of an array and outputs the value.
   * 
   * @param someArray Should include an array of
   *                  int values.
   */
  public static void getSum(int[] someArray) {
    int sum = 0;
    for (int i : someArray) {
      sum += i;
    }
    System.out.println("The sum of the array is: " + sum);
  }
}
