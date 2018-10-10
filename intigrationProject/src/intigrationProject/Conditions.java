package intigrationProject;

public class Conditions {
	public static void numbers() {
	int a = 2 + 2; // Addition = 4
	int b = 2 - 2; // Subtraction = 0
	int c = 2 * 2; // Multiplications = 4
	int d = 2 / 2; // Division = 1
	int e = 2 % 2; // remainder = 0
	
	int f = 1;
	f = f++;       // adds one to f = 2
	
	int g = 1;
	g = g--;       // subtracts 1 from g = 0
	int h = 2;
	h += h;        // adds h to itself = 4
	}
public static void compareHouse() {
		String gryffin = "Gryffindor";
		String snake = "Slytherin";
		System.out.println(gryffin.compareTo(snake)>0? "Ten points to Slytherin": "Ten points to Gryffindor"); // ternary operator
		System.out.println();
		// Can not use == for String because String are assigned different numbers, so no matter what they are going to be different.
	}
}
