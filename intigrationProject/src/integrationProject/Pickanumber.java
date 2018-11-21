// Created by: Zachary Maroney

package integrationProject;

import java.util.Random;

public class Pickanumber {

  public static int selectNum() { // number generator from 1-4
    Random randomGen = new Random();
    int i = 1 + randomGen.nextInt(4);
    return i;
  }

  public static void printPi() {
    double pi = Math.PI;
    System.out.print(pi); // If you ever need to print the value of pi, but don't remember it.
  }
}
