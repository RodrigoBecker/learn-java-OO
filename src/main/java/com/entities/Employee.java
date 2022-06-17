package com.entities;

public class Employee {

  public String name;
  public double grossSalary;
  public double tax;

  public double netSalaray() {

    return grossSalary - tax;
  }

  public void increaseSalaray(double percentage) {
    grossSalary += (grossSalary * percentage / 100);
    System.out.println("**********" + grossSalary);
  }

  public String toString() {
    return "Employee: "
        + name
        + ", $"
        + String.format("%.2f", netSalaray());
  }

}
