package com.entities;

public class Student {

  public String name;
  public double evaluationFirst;
  public double evaluationSecond;
  public double evaluationThird;

  public double average() {
    return (evaluationFirst + evaluationSecond + evaluationThird) / 3;
  }

  public void approveDecision(double average) {

    if (average >= 60.0) {
      System.out.println("PASS");
    } else {
      System.out.println("FAILED");
      System.out.printf("MISSING %.2f", 60.0 - average);
    }

  }
}
