// Created by: Zachary Maroney

package integrationProject;

// Use super and this to access objects and constructors
public class Person {

  Person(String name) {
    System.out.println(name + " is a person");
  }
}


class Student extends Person {
  Student(String name) {
    // calls the constructor in the super class
    super(name);

    System.out.println(name + " is a student");
  }
}


class Wizard extends Student {
  Wizard(String name) {
    // calls the constructor in the super class
    super(name);

    System.out.println(name + " is a Wizard");
  }
}


class House extends Wizard {
  House(String name, String house) {
    // calls the constructor in the super class
    super(name);

    System.out.println(name + " is a " + house);
  }
}
