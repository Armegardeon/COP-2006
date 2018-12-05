package integrationProject;

/**
 * says that user is a student.
 * 
 * @author Zachary Maroney
 */
public class Student extends Person {
  Student(String name) {
    // calls the constructor in the super class
    super(name);

    System.out.println(name + " is a student");
  }
}

