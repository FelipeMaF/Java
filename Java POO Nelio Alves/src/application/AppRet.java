package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class AppRet {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Rectangle retang = new Rectangle();

    System.out.println("Insira a altura e largura do retangulo:");
    retang.height = sc.nextDouble();
    retang.width = sc.nextDouble();

    System.out.println(retang);

    sc.close();
  }
}
