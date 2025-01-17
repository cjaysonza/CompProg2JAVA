/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sonzajan17;

/**
 *
 * @author csonza
 */
import java.util.Scanner;

public class SonzaJan17 {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
//        
//        // THIS IS FOR INTS
//        int num1;
//        int num2;
//        num1 = 1;
//        num2 = 2;
//        int sum = 1 + 2;
//
//        System.out.println("The sum is: " + sum);
//        
//        // THIS IS FOR FLOATS
//        float price1;
//        price1 = 10.5f;
//        float price2 = 11.15f;
//        float difference = (price1 - price2);
//        
//        
//        System.out.println("The first price is: " + price1);
//        System.out.println("The second price is: " + price2);
//        System.out.println("The subtraction of both is: " + difference);
//        System.out.println("\n\n");
//        
//        
//        // THIS IS FOR DOUBLES
//        double new_price = (double) price1;
//        
//        System.out.println(new_price);
//        System.out.println(new_price * 2);

//        // THIS IS FOR STRINGS
//        String firstName, middleName, lastName;
//        firstName = "Christian Jay";
//        middleName = "Hernandez";
//        lastName = "Sonza";
//        System.out.println(lastName.toUpperCase() + "\n" + firstName + ", " + middleName);
//        
//        System.out.println("There is a sentence that is too long f"
//                + "or the presentation");
//        
//      
        // TO GET USER INPUT
//        String firstName, lastName;
//        System.out.print("What is your first name: ");
//        firstName = scanner.nextLine();
//        System.out.print("What is your last name: ");
//        lastName = scanner.nextLine();
//        System.out.println("Your Name is: " + lastName.toUpperCase() + ", " + firstName);
//        

//        int value1, value2;
//        System.out.print("Enter the first value: ");
//        value1 = scanner.nextInt();
//        System.out.print("Enter the second value: ");
//        value2 = scanner.nextInt();
//        
//        System.out.println("The Addition of the two values are: " + value1 + value2);        
//        System.out.println("The Addition of the two values are: " + (value1 + value2));
        
        int age;
        String firstName, lastName, middleName, address;
        System.out.print("What is your first name: ");
        firstName = scanner.nextLine();
        System.out.print("What is your middle name: ");
        middleName = scanner.nextLine();
        System.out.print("What is your last name: ");
        lastName = scanner.nextLine();

        
        System.out.print("What is your Age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Where do you live?: ");
        address = scanner.nextLine();
        
        System.out.println("I am " + firstName + ", " + middleName + ", " + lastName + ". I am " + age + "-years old, "
                + "and I live at " + address);
        
        
        scanner.close();
     }
}       

