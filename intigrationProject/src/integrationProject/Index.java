// Created by: Zachary Maroney

package integrationProject;

// Search an array and identify the index where a value was found.
public class Index {

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
