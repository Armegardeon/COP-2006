// Created by: Zachary Maroney

package integrationProject;

/**
 * Overrides the Animal class to set the sound to the associated animal.
 * 
 * @author Zachary Maroney
 */
public class Shark extends Animal {
  @Override
  public void sound() {
    System.out.println("Du Du Du");
  }
}
/*
 * inheritance allows classes to use methods that are extended of it This is good for multiple
 * classes that need one method creating one parent class
 */
