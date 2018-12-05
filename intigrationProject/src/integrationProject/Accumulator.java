// Created by: Zachary Maroney

package integrationProject;

public class Accumulator {
  public static void getSum(int[] someArray) {
    int sum = 0;
    for (int i : someArray) {
      sum += i;
    }
    System.out.println("The sum of the array is: " + sum);
  }
}
