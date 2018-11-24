// Created by: Zachary Maroney

package integrationProject;

import java.util.ArrayList;

// Declare and use an ArrayList of a given type
public class ArrayListEmpty {
  public static void testArrayList() {
    ArrayList al = new ArrayList<>();   // declares new array list
    al.add("ZAM");    // adds elements to the arraylist
    al.add("test");
    al.add(1, "Z");  // assigns "A" to index 1
    al.add(3, "2");
    al.add(4, "0");
    System.out.println(al);            // prints arraylist
    System.out.println(al.isEmpty());  // checks if arraylist is empty
    System.out.println(al.size());     // prints the size of the array
  }
}
