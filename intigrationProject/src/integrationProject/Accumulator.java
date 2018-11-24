package integrationProject;

public class Accumulator {
  public static void getSum() {
    int someArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int sum = 0;

    for (int i : someArray) {
      sum += i;
    }
    System.out.println("The sum of the array is: "+sum);
  }
}
