package integrationProject;

public class Character {

  private String name;
  private int health;

  public String getName() {
    return name;
  }

  public void setName(String nm) {
    name = nm;
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int hl) {
    health = hl;
  }

  public Character() {
    System.out.println("I'm in the default constructor");
    name = "unknown";
    health = 0;
  }

  public Character(String charName, int charHealth) {
    System.out.println("I'm in the overloaded constructor.");
    name = charName;
    health = charHealth;
  }

}
