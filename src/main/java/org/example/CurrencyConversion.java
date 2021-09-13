package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Kisida
 */

import java.util.Scanner;
public class CurrencyConversion
{
    public static void main( String[] args )
    {

        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.print("How many euros are you exchanging? ");
        int euros = input.nextInt();  // Read user input
        System.out.print("What is the exchange rate? ");
        double exchangeRate = input.nextDouble();  // Read user input
        double dollars = euros * exchangeRate;
        double round = Math.round(dollars * 100.0) /100.0;

        String output1 = String.format("%d euros at an exchange rate of %.4f is\n%.2f U.S. dollars.", euros, exchangeRate, round);
        System.out.println(output1);
        input.close();
    }
}
