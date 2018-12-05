// Created by; Zachary Maroney

package integrationProject;

/**
 * Find the smallest value in an array.
 * 
 * @author Zachary Maroney
 */
public class Minimum {
  /**
   * Prints the minimum value of an array.
   */
  public static void printMin() {
    int[] array = new int[] {25, 45, 32, 12, 65, 5, 43};
    int min = getMin(array);
    System.out.println("Minimum number of points that a teacher can take from a house is: " + min);
  }

  /**
   * Searches array and finds the minimum value of the array.
   * 
   * @param inputArray takes in any int array.
   * @return minimum value of the array.
   */
  public static int getMin(int[] inputArray) {
    int minValue = inputArray[0];
    for (int i = 1; i < inputArray.length; i++) {
      if (inputArray[i] < minValue) {
        minValue = inputArray[i];
      }
    }
    return minValue;
  }

}
