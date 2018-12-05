// Created by: Zachary Maroney

package integrationProject;

/**
 * Search an array and identify the index where a value was found.
 * 
 * @author Zach
 */
public class Index {

  /**
   * Search and find the index of an array.
   * 
   * @param array list of number in array form.
   * @param elem number in the array
   * @return the index of the elem.
   */
  public static int findIndex(int array[], int elem) {
    if (array == null) {
      return -1;
    }

    int len = array.length;
    int i = 0;

    while (i < len) {

      if (array[i] == elem) {
        return i;
      } else {
        i++;
      }
    }
    return -1;
  }
}
