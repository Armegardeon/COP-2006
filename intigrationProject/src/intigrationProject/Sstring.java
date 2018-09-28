package intigrationProject;

public class Sstring {
	
	public static void compareHouse() {
		String gryffin = "Gryffindor";
		String snake = "Slytherin";
		System.out.println(gryffin.compareTo(snake)>0? "Ten points to Slytherin": "Ten points to Gryffindor");
		System.out.println();
		// Compares the words "Gryffindor" and "Slytherin" lexicographically. snake is larger, so it produces the second statement.
	}
	public static void indexChar() {
		String raven = "Ravenclaw";
		for (int i=0;i < raven.length(); i++) {   // grabs the length of the variable raven, using the .length() method
												  // it's value is 8 because .lengh() = the number of letter -1.
			System.out.println(raven.charAt(i));  // prints the Character in raven at i value.
		}
		System.out.println();
	}
	public static void escape() {
		String spell = "Why do \t I feel so \n weird...\n Is this \t a sp\tell";  // uses escape sequences to edit this string
		System.out.println(spell);
		System.out.println();
	}

}
