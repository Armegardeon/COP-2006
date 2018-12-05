// Created by: Zachary Maroney

package integrationProject;

//Develop code that makes use of polymorphism
public class Shark extends Animal { // Overrides the Animal class to set the sound to the associated
  // animal
  @Override
  public void sound() {
    System.out.println("Du Du Du");
  }

  public static void main(String[] args) {
    Animal obj = new Shark();
    obj.sound();
  }
}
/*
 * inheritance allows classes to use methods that are extended of it This is good for multiple
 * classes that need one method creating one parent class
 */
