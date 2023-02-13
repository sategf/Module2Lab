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
public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(2, 13, 2023);
        
        date.displayDate();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Change date? yes or no: ");
        String changeDate = input.nextLine();
        if ("yes".equals(changeDate)) {
            System.out.println("Enter month: ");
            int newMonth = input.nextInt();
            System.out.println("Enter day: ");
            int newDay = input.nextInt();
            System.out.println("Enter year: ");
            int newYear = input.nextInt();
            
            date.setMonth(newMonth);
            date.setDay(newDay);
            date.setYear(newYear);
            
            System.out.println("New date: ");
            date.displayDate();
        }
    }
}
