// Created by: Zachary Maroney

package integrationProject;

// Search a two-dimensional array and identify the coordinates where a value was found
public class SearchTwoDimensional { 

  public static void locateValue(int[][] board, int value) {
    int x = 0, y = 0;
    for (int i=0; i < board.length; i++) {
        for (int j=0; j < board[0].length; j++) {
            if (board[i][j] == value) {
                x = i;
                y = j;
            }
        }
    }
    System.out.println("Found "+ value + " at point (" + x + ", " + y + ")");
  }
}