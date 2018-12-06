// Created by: Zachary Maroney

package integrationProject;

/**
 * Format sentences to show what a wizards wand are composed of.
 * 
 * @author Zachary Maroney
 */
public class Methods {

  /**
   * Forms a sentence that states a user's wand is created from a certain wood.
   * 
   * @param wood grabs whatever wood the user wants to use.
   * @return sentence that states its crafted from said wood.
   */
  public static String askWood(String wood) {
    wood = ("crafted from a(n) " + wood + " log");
    return wood;
  }

  /**
   * Forms a sentence that states a user's wand is created from a certain essence.
   * 
   * @param essence grabs whatever essence the user wants to use.
   * @return sentence that states its crafted from said essence.
   */
  public static String askEssence(String essence) {
    essence = (" and impued with the essence of a(n) " + essence + "!");
    return essence;
  }

}
