package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class AppEmploye {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Employee employe = new Employee();

    System.out.print("Name: ");
    employe.name = sc.nextLine();

    System.out.print("Gross Salary: ");
    employe.grossSalary = sc.nextDouble();

    System.out.print("Tax: ");
    employe.tax = sc.nextDouble();

    System.out.println(employe);


    System.out.print("Which percentage to increase salary? ");
    double percentage = sc.nextDouble();
    employe.IncreaseSalary(percentage);

    System.out.println(employe.NetSalary());

    
    sc.close();
  }
  
}
