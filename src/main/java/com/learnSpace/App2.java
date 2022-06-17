package com.learnSpace;

import java.util.Scanner;

import com.entities.Product;

public class App2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Insert product data: ");
    System.out.print("Name: ");
    String name = sc.nextLine();
    System.out.print("Price: ");
    double price = sc.nextDouble();
    System.out.print("Quantityt in Stock: ");
    int quantity = sc.nextInt();

    Product product = new Product(name, price, quantity);
    // System.out.println(product.name + "," + product.price + "," +
    // product.quatity);
    System.out.println("Product data: " + product);
    System.out.println("Enter the number of products to be added in stock: ");
    int quatity = sc.nextInt();
    product.addProduct(quatity);

    System.out.println("Update data : " + product);

    System.out.println("Enter the number of products to be removed from stock: ");
    quatity = sc.nextInt();
    product.removeProducts(quatity);

    System.out.println("Updated data: " + product);
    sc.close();
  }

}
