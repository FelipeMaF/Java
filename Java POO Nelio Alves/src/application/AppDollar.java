package application;

import java.util.Locale;
import java.util.Scanner;

import entities.DollarConverter;

public class AppDollar {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
   System.out.print("What is the dollar price? ");
   double precoDollar = sc.nextDouble();

   System.out.print("How many dollars will be bought? ");
   double quantosDollar = sc.nextDouble();

   double totalDollar = precoDollar * quantosDollar;

   System.out.println("Amount to be paid in reais = " + DollarConverter.total(totalDollar));
   

    sc.close();
  }
}
