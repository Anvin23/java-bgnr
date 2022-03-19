package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // terminates when user press X or x
        while (true) {
            System.out.println("Enter the operator symbol : ");
            char op = sc.next().charAt(0);
            // taking operator
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter two numbers");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
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
                            System.out.println("invalid!!");
                        }
                        break;
                    case '%':
                        System.out.println(num1 % num2);
                        break;
                    default:
                        break;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid operation!!!");
            }

        }
    }
}

