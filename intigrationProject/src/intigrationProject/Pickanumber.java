package intigrationProject;
import java.util.Random;

public class Pickanumber {
	
	public static int random() {         // number generator from 1-4
		Random randomGen = new Random();
		int i = 1+randomGen.nextInt(4);
		return i;
	}
	public static void Pi() {
		double pi = Math.PI;
		System.out.print(pi); // If you ever need to print the number pi, but don't remember it.
	}
}
