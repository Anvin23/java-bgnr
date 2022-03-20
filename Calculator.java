package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // terminates when user press X or x
        while (true) {
            System.out.println("Enter the operation with two numbers: ");
            // example  54 + 56  with spaces
            int num1 = sc.nextInt();
            char op = sc.next().charAt(0);
            int num2 = sc.nextInt();
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
               switch (op) {
                   case '+':
                       System.out.println(num1 + num2);
                       break;
                   case '-':
                       System.out.println(num1 - num2);
                       break;
                   case '*':
                       System.out.println(num1 * num2);
                       break;
                   case '/':
                       if (num2 != 0) {
                           System.out.println(num1 / num2);
                       } else {
                           System.out.println("Division by 0 is not defined !");
                       }
                       break;
                   case '%':
                       System.out.println(num1 % num2);
                       break;
                   default:
               }
                }
             else {
                System.out.println("Invalid operation!!!");
            }
            System.out.println();
            System.out.println("Press x to exit ");
            System.out.println("Press any other key to run again");
            char key = sc.next().charAt(0);
            if(key=='x' || key=='X')
            {
                break;
            }

        }
    }
}

