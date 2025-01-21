/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sonzajan21;

/**
 *
 * @author csonza
 */
import java.util.Scanner;

public class SonzaJan21 {
 public static void main (String[] args)  {
        Scanner scanner = new Scanner(System.in);

        String product1 = null, product2 = null;
        double price1 = 0.0d, price2 = 0.0d;

        System.out.print("Enter Product 1 Name: ");
        product1 = scanner.nextLine();
        System.out.print("Enter Product 1 Price: ");
        price1 = scanner.nextDouble();
        scanner.nextLine();
        

        System.out.print("Enter Product 2 Name: ");
        product2 = scanner.nextLine();
        System.out.print("Enter Product 2 Price: ");
        price2 = scanner.nextDouble();
        scanner.nextLine();


        System.out.println("=-=-=-=-=-=-=-=-=-=");

        System.out.println("Output is: ");
        System.out.println("Product 1 Name: " + product1 + ", Price: " + price1);
        System.out.println("Product 2 Name: " + product2 + ", Price: " + price2);

        scanner.close();
    }
}
