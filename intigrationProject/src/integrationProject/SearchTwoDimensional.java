// Created by: Zachary Maroney

package integrationProject;

/**
 * Search a two-dimensional array and identify the coordinates where a value was found.
 * 
 * @author Zachary Maroney
 */
public class SearchTwoDimensional {

  /**
   * Locate that position of a value in a two-dimensional array.
   * 
   * @param board the two-dimensional array that is being searched. needs to be an int array of int
   *        values.
   * @param value the int that is being searched for in the array.
   */
  public static void locateValue(int[][] board, int value) {
    int x = 0;
    int y = 0;
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] == value) {
          x = i;
          y = j;
        }
      }
    }
    System.out.println("Found " + value + " at point (" + x + ", " + y + ")");
  }
}
