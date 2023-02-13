package com.gili.mod2lab;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer10
 */
import java.util.Scanner;
public class InvoiceTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Invoice inv1 = new Invoice("001", "Power Drill Kit", 10, 59.99);
        
        System.out.println("Part Number: " + inv1.getPartNumber());
        System.out.println("Part Description: " + inv1.getPartDescription());
        System.out.println("Quantity: " + inv1.getQuantity());
        System.out.println("Price per Item: $" + inv1.getPricePerItem());
        System.out.println("Invoice Amount: $" + inv1.getInvoiceAmount());
        
        System.out.println("Change Quantity? yes or no: ");
        String changeQuantityString = input.nextLine();
        if ("yes".equals(changeQuantityString)) {
            System.out.println("Enter new Quantity:");
            int newQuantity = input.nextInt();
            inv1.setQuantity(newQuantity);
            input.nextLine();
            System.out.println("Quantity: " + inv1.getQuantity());
            System.out.println("Invoice Amount: $" + inv1.getInvoiceAmount());
        }
        
        System.out.println("Change Price? yes or no: ");
        String changePriceString = input.nextLine();
        if ("yes".equals(changePriceString)) {
            System.out.println("Enter a new price: ");
            double newPrice = input.nextDouble();
            inv1.setPricePerItem(newPrice);
            input.nextLine();
            System.out.println("Price per Item: $" + inv1.getPricePerItem());
            System.out.println("Invoice Amount: $" + inv1.getInvoiceAmount());
        }

    }
}
