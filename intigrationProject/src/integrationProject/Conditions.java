// created by: Zachary Maroney

package integrationProject;

/**
 * Testing out number variables. Testing out String methods.
 * 
 * @author Zachary Maroney
 */
public class Conditions {
  /**
   * Tests out int values. uses simple math to change output.
   */
  public static void equateNumbers() {
    int a = 2 + 2; // Addition = 4
    int b = 2 - 2; // Subtraction = 0
    int c = 2 * 2; // Multiplications = 4
    int d = 2 / 2; // Division = 1
    int e = 2 % 2; // remainder = 0
    System.out.println(a + b + c + d + e);

    int f = 1;
    f++; // adds one to f = 2
    System.out.println(f);

    int g = 1;
    g--;; // subtracts 1 from g = 0
    int h = 2;
    h += h; // adds h to itself = 4
    System.out.println(g + h);
  }

  /**
   * Compares two strings. outputs a statement
   */
  public static void compareHouse() {
    String gryffin = "Gryffindor";
    String snake = "Slytherin";
    System.out.println(gryffin.compareTo(snake) > 0 ? "Ten points to Slytherin" : // ternary
        // operator
        "Ten points to Gryffindor");
    // Can not use == for String because String are assigned different numbers,
    // so no matter what they are going to be different.
  }
}
