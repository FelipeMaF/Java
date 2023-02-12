package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class AppStudent {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Student student = new Student();

    System.out.println("Digite o nome do aluno e em seguida as 3 notas do semestre: ");
    student.nome = sc.nextLine();
    student.nota1 = sc.nextDouble();
    student.nota2 = sc.nextDouble();
    student.nota3 = sc.nextDouble();

    System.out.println(student);


    sc.close();
  }
}
