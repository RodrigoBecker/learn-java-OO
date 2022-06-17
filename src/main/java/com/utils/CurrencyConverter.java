package com.utils;

public class CurrencyConverter {

  public static double IOF = 6.0;

  public static double dollarConvert(double amount, double dollar) {
    double tax = taxIOF(dollar) * amount;
    return (dollar * amount) + tax;
  }

  public static double taxIOF(double dollar) {
    return (dollar * IOF) / 100;
  }

}
