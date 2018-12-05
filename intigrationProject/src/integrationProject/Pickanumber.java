// Created by: Zachary Maroney

package integrationProject;

import java.util.Random;

/**
 * print the number pi and random number selector.
 * 
 * @author Zachary Maroney
 */
public class Pickanumber {

  /**
   * gives a random number from 1 to 4.
   * 
   * @return number from 1-4.
   */
  public static int selectNum() {
    Random randomGen = new Random();
    int i = 1 + randomGen.nextInt(4);
    return i;
  }

  public static void printPi() {
    double pi = Math.PI;
    System.out.print(pi); // If you ever need to print the value of pi, but don't remember it.
  }
}
