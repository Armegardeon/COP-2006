// created by: Zachary Maroney

package integrationProject;

/**
 * Examples of difference String methods.
 * 
 * @author Zachary Maroney
 */
public class Words {

  /**
   * Compares two Strings and outputs a statement that, with which ever one comes first in a
   * dictionary.
   */
  public static void compareHouse() {
    String gryffin = "Gryffindor";
    String snake = "Slytherin";
    System.out.println(gryffin.compareTo(snake) > 0 ? "Ten points to Slytherin" : // ternary
        // operator
        "Ten points to Gryffindor");
    // Compares the words "Gryffindor" and "Slytherin" lexicographically.
    // snake is larger, so it produces the second statement.
  }

  /**
   * Prints a String with each character on a separate line.
   */
  public static void indexChar() {
    String raven = "Ravenclaw";
    for (int i = 0; i < raven.length(); i++) { // grabs the length of the variable raven, using the
      // .length() method
      // it's value is 8 because .lengh() = the number of
      // letter -1.
      System.out.println(raven.charAt(i)); // prints the Character in raven at i value.
    }
  }

  /**
   * Example of using escape sequences in String values.
   */
  public static void castSpell() {
    String spell = "Why do \t I feel so \n weird...\n Is this \t a sp\tell"; // uses escape
    // sequences to edit
    // this string
    System.out.println(spell);
  }

}
