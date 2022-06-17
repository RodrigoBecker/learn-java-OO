package com.learnSpace;

import java.util.Scanner;
import com.entities.Triangle;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Triangle x, y;
    x = new Triangle();
    y = new Triangle();

    System.out.println("Insert the measures of triagle x: ");
    x.a = sc.nextDouble();
    x.b = sc.nextDouble();
    x.c = sc.nextDouble();

    System.out.println("Insert the measures of triagle y: ");
    y.a = sc.nextDouble();
    y.b = sc.nextDouble();
    y.c = sc.nextDouble();

    double areaX = x.area();
    double areaY = y.area();

    System.out.printf("Triangle x area %.4f%n", areaX);
    System.out.printf("Triangle y area %.4f%n", areaY);

    if (areaX > areaY) {
      System.out.println("Larger area : X");
    } else {
      System.out.println("Large area : Y");
    }

    sc.close();
  }
}
