package entities;

public class Rectangle {
  public double width; 
  public double height; 

  public double area () {
   return width * height;
  }

  public double perimeter () {
   return (height * 2) + (width * 2);
  }

  public double diagonal () {
   double x = (width * width) + (height * height);
   double y = Math.sqrt(x);
   return y;
  }

  public String toString () {
    return "AREA = " + String.format("%.2f", area()) +
    "\nPERIMETER = " + String.format("%.2f", perimeter()) +
    "\nDIAGONAL = " + String.format("%.2f", diagonal());

  }
}
