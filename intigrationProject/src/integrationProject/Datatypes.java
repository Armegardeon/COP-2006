// created by: Zachary Maroney

package integrationProject;

/*
 * DataTypes: -byte: small storage with value from [-2^8 - (2^8)-1] -short: number, not decimal,
 * smaller than an int. -int: number, that is not a decimal. -long: very large int value.
 * -float:decimal number, smaller than a double. -double: decimal number. -boolean: True or False
 * -char: single character.
 */
public class Datatypes {

  String letters = "This sentence is used as an example";

  final double PI = 3.14; // makes Pi always = to 3.14, essentially a constant.

  // Variables are place holders for values.
  // Scope is what the code is allowed to manipulate.

  public static void assignBool() {
    boolean fals = false;
    boolean tru = true;
  }

  public static void assignStats() {
    int integer = 42;
    double dub = 4.2;
    System.out.println(
        "legend says that " + (integer + dub) + "% of students dont get the house that they want.");
    dub = (int) dub; // changed the value dub from a double to a integer value.
    System.out.println((int) (dub + integer) + "% if you round it.");
  }

}
