// Created by: Zachary Maroney

package integrationProject;

public class Rectangle {

  private int xcord;
  private int ycord;
  private int width;
  private int height;

  public Rectangle() {
    this(0, 0, 1, 1);
  }

  public Rectangle(int width, int height) {
    this(0, 0, width, height);
  }

  public Rectangle(int x, int y, int width, int height) {
    this.setX(x);
    this.setY(y);
    this.setWidth(width);
    this.setHeight(height); // Use this to access objects and constructors
  }

  public int getX() {
    return xcord;
  }

  public void setX(int x) {
    this.xcord = x;
  }

  public int getY() {
    return ycord;
  }

  public void setY(int y) {
    this.ycord = y;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }
}
