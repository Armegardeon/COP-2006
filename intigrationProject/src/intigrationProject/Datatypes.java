package intigrationProject;

/*
 * DataTypes:
 * -byte: The byte data type is an 8-bit signed two's complement integer. 
 *  It has a minimum value of -128 and a maximum value of 127 (inclusive).
 * -short: The short data type is a 16-bit signed two's complement integer.
 *  It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).
 * -int: By default, the int data type is a 32-bit signed two's complement integer,
 *  which has a minimum value of -231 and a maximum value of 231-1.
 * -long: The long data type is a 64-bit two's complement integer. 
 *  The signed long has a minimum value of -263 and a maximum value of 263-1.
 * -float: The float data type is a single-precision 32-bit IEEE 754 floating point.
 * -double: The double data type is a double-precision 64-bit IEEE 754 floating point.
 * -boolean: The boolean data type has only two possible values: true and false.
 * -char: The char data type is a single 16-bit Unicode character.
 */
public class Datatypes {
	
	String letters = "This sentence is used as an example";
	
	final double PI = 3.14; // makes Pi always = to 3.14, essentially a constant.
	
	// Variables are place holders for values.
	// Scope is what the code is allowed to manipulate.
	
	public static void boolHat() {
		boolean fals = false;
		boolean tru = true;
	}
	public static void numbers() {
		int integer = 42;
		double dub = 4.2;
		System.out.println("legends say that "+(integer+dub)+"% of students dont get the house that they want.");
		dub = (int)dub;    // changed the value dub from a double to a integer value.
		System.out.println((int)(dub+integer)+"% if you round it.");
	}

}
