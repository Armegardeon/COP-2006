package integrationProject;

/**
 * says that user is in a harry potter house.
 * 
 * @author Zachary Maroney
 */
public class House extends Wizard {
  House(String name, String house) {
    // calls the constructor in the super class
    super(name);

    System.out.println(name + " is a " + house);
  }
}
