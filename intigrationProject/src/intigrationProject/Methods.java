package intigrationProject;

import java.util.Scanner;

public class Methods {
	
	public static void wandCust() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What essence of a mythical animal would you want in your wand?:");
		String essence = scan.nextLine();
		System.out.println("What kind of wood would you like your wand to be made out of?:");
		String wood = scan.nextLine();
		System.out.println("Wow! Such a great wand that is "+wandWood(wood) +wandEssence(essence));
		scan.close();
	}
	
	public static String wandWood(String wood){
		wood = ("crafted from a(n) "+wood+" log");
		return wood;
	}
	public static String wandEssence(String essence) {
		essence = (" and impued with the essence of a(n) "+essence+"!");
		return essence;
	}
}
