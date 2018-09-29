package intigrationProject;

import java.util.Scanner;

public class Methods {
	
	public static void Wandcust() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What essence of a mythical animal woudl you want in your wand?:");
		String essence = scan.nextLine();
		System.out.println("What kind of wood would you like your wand to be made out of?:");
		String wood = scan.nextLine();
		System.out.println("Wow! Such a great wand that is "+Wandwood(wood) +Wandessence(essence));
		scan.close();
	}
	
	public static String Wandwood(String wood){
		wood = ("crafted from a "+wood+" log");
		return wood;
	}
	public static String Wandessence(String essence) {
		essence = (" and impued with the essence of a "+essence+"!");
		return essence;
	}
}
