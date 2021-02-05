package com.company;
import lab1.SillyCalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        print_lab1();
    }

    public static void print_lab1(){
        System.out.println("-------------------------------------------");
        System.out.println("                  LAB 1                    ");
        System.out.println("-------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide first number");
        int num1 = scanner.nextInt();
        System.out.println("Provide second number");
        int num2 = scanner.nextInt();
        SillyCalculator calculator = new SillyCalculator(num1, num2);
        calculator.printResults();
    }
}
