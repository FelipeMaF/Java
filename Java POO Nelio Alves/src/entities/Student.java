package entities;

public class Student {
  public String nome;
  public double nota1, nota2, nota3;

  public double Media() {
   return nota1 + nota2 + nota3;
  }

   public String toString() {
    String result = "FINAL GRADE = " + String.format("%.2f", Media());
    
    if (Media() >= 60) {
      result += "PASS";}
    else {result += "\nFAILED" + "\nMISSING " + (60 - Media()) + " POINTS";};
    return result;
   }
  }


