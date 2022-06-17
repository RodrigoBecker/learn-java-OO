package com.learnSpace;

import java.util.Scanner;

import com.utils.CurrencyConverter;

/**
 * App5
 */
public class App5 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("What is the dollar price? ");
    double dollarPrice = sc.nextDouble();
    System.out.println("How many dollars will be bought? ");
    double realAmount = sc.nextDouble();
    System.out.printf("Amout to be paid in reais = %.2f", CurrencyConverter.dollarConvert(realAmount, dollarPrice));

    sc.close();

  }

}
