package com.learnSpace;

import java.util.Scanner;

import com.entities.Student;

public class App4 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Student student = new Student();

    System.out.println("Insert name");
    student.name = sc.nextLine();

    System.out.println("Insert First Note: ");
    student.evaluationFirst = sc.nextDouble();

    System.out.println("Insert Second Note: ");
    student.evaluationSecond = sc.nextDouble();

    System.out.println("Insert Third Note: ");
    student.evaluationThird = sc.nextDouble();

    double average = student.average();
    student.approveDecision(average);

    sc.close();
  }

}
