// Created by: Zachary Maroney

package integrationProject;

/**
 * Sort user into a random house.
 * 
 * @author Zachary Maroney
 */
public class HouseSelection {
  /**
   * Picks a random number from 1-4 each house is associated with a number.
   * 
   * @return the randomly selected house.
   */
  public static String selectHouse() {
    String house = "";
    switch (Pickanumber.selectNum()) {
      case 1:
        house = "Gryffindor";
        break;
      case 2:
        house = "Ravenclaw";
        break;
      case 3:
        house = "Hufflepuff";
        break;
      case 4:
        house = "Slytherin";
        break;
      default:
        break;
    }
    return house;
  }


}
