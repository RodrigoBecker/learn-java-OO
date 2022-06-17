package com.learnSpace;

import java.util.Scanner;

import com.entities.Employee;

public class App3 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Employee employee = new Employee();

    System.out.println("Insert Name: ");
    employee.name = sc.nextLine();
    System.out.println("Insert Gross Salary: ");
    employee.grossSalary = sc.nextDouble();
    System.out.println("Insert Tax about Salary: ");
    employee.tax = sc.nextDouble();

    System.out.println(employee.toString());
    System.out.println("Which percentage to increase salaray? ");
    double percentage = sc.nextDouble();
    employee.increaseSalaray(percentage);
    System.out.printf("Updated data:" + String.format("%.2f", employee.netSalaray()));

    sc.close();
  }
}
