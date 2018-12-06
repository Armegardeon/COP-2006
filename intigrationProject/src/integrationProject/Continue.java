// Created by: Zachary Maroney

package integrationProject;

import java.util.Scanner;

/**
 * Press the enter key to continue.
 * 
 * @author Zachary Maroney
 */
public class Continue {
  /**
   * Asked the user to press enter on their keyboard to continue.
   */
  public static void pressEnter() {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("[Press ENTER to continue]");
    sc.nextLine();
  }
}
