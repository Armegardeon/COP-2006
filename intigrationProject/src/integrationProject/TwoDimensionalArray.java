// Created by: Zachary Maroney

package integrationProject;

/**
 * Declare, instantiate, initialize and use multi-dimensional arrays.
 * 
 * @author Zachary Maroney
 */
public class TwoDimensionalArray {
  /**
   * Use 2 dimensional arrays to assign prefixes to a last name.
   */
  public static void make2DArray() {
    String[][] title = {{"Mr. ", "Mrs. ", "Ms. "}, {"Maroney"}};
    System.out.println(title[0][0] + title[1][0]);
    System.out.println(title[0][1] + title[1][0]);
    System.out.println(title[0][2] + title[1][0]);
  }
}
