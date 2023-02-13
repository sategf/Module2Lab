/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gili.mod2lab;

/**
 *
 * @author Acer10
 */
import java.util.Scanner;
public class SaleCalculator {
    public static void main(String[] args) {
        int productNum;
        int quantitySold;
        double price = 0.0;
        double total = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter product number then quantity");
        productNum = input.nextInt();
        
        while (productNum != -1) {
            quantitySold = input.nextInt();

            if (productNum == 1) {
              price = 2.98;
            } 
            else if (productNum == 2) {
              price = 4.50;
            } 
            else if (productNum == 3) {
              price = 9.98;
            } 
            else if (productNum == 4) {
              price = 4.49;
            } 
            else if (productNum == 5) {
              price = 6.87;
            } 
            else {
              System.out.println("Invalid product number.");
              price = 0.0;
            }

            total += price * quantitySold;

            System.out.println("Enter a product number and a quantity sold or -1 to quit:");
            productNum = input.nextInt();

        }
        
        System.out.println("The total will be $" + total);
    }
}
