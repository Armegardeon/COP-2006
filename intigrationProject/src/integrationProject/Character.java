// Created by: Zachary Maroney

package integrationProject;

/**
 * creates a character and assigns them a health.
 * 
 * @author Zachary Maroney
 */
public class Character {

  /**
   * Initializes name as a String.
   */
  private String name;
  /**
   * Initializes health as an int.
   */
  private int health;

  /**
   * gets character's name.
   * 
   * @return this characters name.
   */
  public String getName() {
    return name;
  }

  /**
   * Change the name of this character. Must ask the player if they want to proceed before
   * completion.
   * 
   * @param nm This character's new name. can be a first and last name.
   */
  public void setName(String nm) {
    name = nm;
  }

  /**
   * gets the character's health.
   * 
   * @return this character's health.
   */
  public int getHealth() {
    return health;
  }

  /**
   * Change the health of this character. due to battle wounds or being healed. Must not surpass
   * Original health.
   * 
   * @param hl this character's new health. can be from 1-1000
   */
  public void setHealth(int hl) {
    health = hl;
  }

  /**
   * default constructor for when there is not a set name or health for a character.
   */
  public Character() {
    System.out.println("I'm in the default constructor");
    name = "unknown";
    health = 0;
  }

  /**
   * Overloaded constructor. Assigns characters name and health.
   * 
   * @param charName Name of Character. Can include first or last name.
   * @param charHealth Health of Character. Should be a Positive integer.
   */
  public Character(String charName, int charHealth) {
    System.out.println("I'm in the overloaded constructor.");
    name = charName;
    health = charHealth;
  }

}
