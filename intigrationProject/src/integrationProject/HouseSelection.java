package integrationProject;

public class HouseSelection {
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
    }
    return house;
  }

  
}
