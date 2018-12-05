package integrationProject;

/**
 * says that user is a wizard.
 * 
 * @author Zachary Maroney
 */
public class Wizard extends Student {
  Wizard(String name) {
    // calls the constructor in the super class
    super(name);

    System.out.println(name + " is a Wizard");
  }
}
