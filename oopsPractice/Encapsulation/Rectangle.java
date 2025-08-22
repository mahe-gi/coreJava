package Encapsulation;

/*

5.Class: Rectangle
Variables: private double length, private double width
Methods: getters/setters, public double calculateArea(), public double calculatePerimeter()
main: Create rectangle, set dimensions, compute and print area and perimeter.

 */


public class Rectangle {

    private double length;
    private double width;

    public void setLength(double length){
        this.length = length;
    }
    public double getLength(){
        return this.length;
    }

    public void setWidth(double width){
        this.width=width;

    }
    public double getWidth(){
        return this.width;
    }

    public double calculateArea(double length , double width){
        return length * width;
    }
    public double calculatePerimeter(double length,double width){
        return (length+width)*2;
    }


}

class RectangleMain{
  public static void main(String[] args){
      Rectangle r1 = new Rectangle();
      r1.setLength(7);
      r1.setWidth(2);
      double len = r1.getLength();
      double wid = r1.getWidth();
      double area =r1.calculateArea(len,wid);
      System.out.println(area);
      double perimeter = r1.calculatePerimeter(len,wid);
      System.out.println(perimeter);


  }



}
