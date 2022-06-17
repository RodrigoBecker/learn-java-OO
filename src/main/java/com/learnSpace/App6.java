package com.learnSpace;

import java.util.Scanner;

import com.entities.Account;

public class App6 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Insert Agency Bank Number: ");
    long agency = sc.nextLong();
    System.out.println("Insert Account Bank Number: ");
    long accountNumber = sc.nextLong();
    System.out.println("Insert Account Holder: ");
    String accountHolder = sc.nextLine();

    Account account = new Account(accountNumber, agency, accountHolder);

    int isExit = 0;
    while (isExit == 0) {

      System.out.println("1- Cash In | 2- Cash Out | 3 - Account Balance | 4-Exit ");
      int response = sc.nextInt();

      switch (response) {
        case 1:
          System.out.println("Insert amount for Cash In: ");
          double cashIn = sc.nextDouble();
          account.cashiIn(cashIn);
          break;

        case 2:
          System.out.println("Insert amout for Cash Out: ");
          double cashOut = sc.nextDouble();
          double pastBalance = account.getAccountBalance();
          account.cashOut(cashOut);
          if (pastBalance == account.getAccountBalance()) {
            System.out.println(account.warningOperation());
            account.warningOperation();
          }
          break;
        case 4:
          isExit = 1;
          break;

        default:
          account.toString();
          break;

      }
      System.out.println("Updated Account Data: " + account.toString());

    }
    sc.close();
  }

}
