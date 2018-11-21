// Created by: Zachary Maroney

package integrationProject;

public class Person { // Use super and this to access objects and constructors

  Person() {
    System.out.println("Is a person");
  }
}


class Student extends Person {
  Student() {
    // calls the constructor in the super class
    super();

    System.out.println("Is a student");
  }
}

