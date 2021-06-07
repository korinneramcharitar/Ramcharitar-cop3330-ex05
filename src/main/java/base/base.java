/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Korinne Ramcharitar
 */
package base;
//You’ll often write programs that deal with numbers. And depending on the programming language you use, you’ll have to convert the inputs you get to numerical data types.
//Write a program that prompts for two numbers. Print the sum, difference, product, and quotient of those numbers as shown in the example output:

//What is the first number? 10
//What is the second number? 5
//10 + 5 = 15
//10 - 5 = 5
//10 * 5 = 50
//10 / 5 = 2

//Values coming from users will be strings. Ensure that you convert these values to numbers before doing the math.
//Keep the inputs and outputs separate from the numerical conversions and other processing.
//Generate a single output statement with line breaks in the appropriate spots.

import java.util.Scanner;
public class base {
   public static void main (String[] args)
   {
       Scanner input = new Scanner(System.in);
       System.out.println("What is the first number?");
       String num1 = input.nextLine();
       System.out.println("What is the second number?");
       String num2 = input.nextLine();
       int a = Integer.parseInt(num1);
       int b = Integer.parseInt(num2);


       System.out.println( +a+ " + " +b+ " = " + (a + b));

       System.out.println(+a+ " - " +b+ " = "  + (a - b));

       System.out.println(+a+ " * " +b+ " =  " + (a * b));

       System.out.println(+a+ " / " +b+ " = " + (a / b));
   }
}
