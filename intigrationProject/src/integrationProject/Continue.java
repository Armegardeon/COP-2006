// Created by: Zachary Maroney
package integrationProject;

import java.util.Scanner;

public class Continue {
  public static void pressEnter() {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("[Press ENTER to continue]");
    sc.nextLine();
  }

}
