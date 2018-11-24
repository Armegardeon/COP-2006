// Created by: Zachary Maroney

package integrationProject;

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
