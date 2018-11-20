// Created by: Zachary Maroney
package integrationProject;

public class Loops {

  public static void doLoop() {
    int i = 5;
    do {
      System.out.println("this is still gonna print because this is a do/while loop");
    } while (i > 10);
  }

  public static void doArrayBreak() {
    int [] numbers = {1, 2, 3, 4, 5};  // Declare, instantiate, initialize and use a one-dimensional array

    for(int x : numbers) {
       if(x == 4) {
          break;
       }
       System.out.println(x);
    }
  }
}
