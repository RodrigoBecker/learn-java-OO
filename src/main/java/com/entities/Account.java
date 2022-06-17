package com.entities;

public class Account {

  private long account;
  private long agency;
  private String accountHolder;
  private double accountBalance;

  public Account(long account, long agency, String accountHolder) {
    this.account = account;
    this.agency = agency;
    this.accountHolder = accountHolder;
    this.accountBalance = 0.0;
  }

  public long getAccount() {
    return this.account;
  }

  public long getAgency() {
    return this.agency;
  }

  public String getAccountHolder() {
    return this.accountHolder;
  }

  public double getAccountBalance() {
    return this.accountBalance;
  }

  public void setAccountHolder(String accountHolder) {
    this.accountHolder = accountHolder;
  }

  public void cashiIn(double amount) {
    accountBalance += amount;

  }

  public void cashOut(double amount) {

    boolean hasBalance = hasBalanceCashOut(amount);
    if (hasBalance) {
      accountBalance -= amount;
    }
  }

  public String warningOperation() {
    return String.format("WARNING: Operation not executed, Balance: %.2f", accountBalance);
  }

  public boolean hasBalanceCashOut(double amount) {

    if (accountBalance <= 0 || accountBalance < amount) {
      return false;
    } else {
      return true;
    }

  }

  public String toString() {
    return "Agency: "
        + agency
        + ", Account: "
        + account
        + ", Account Holder: "
        + accountHolder + ", Balance: "
        + String.format("%.2f", accountBalance);
  }

}
