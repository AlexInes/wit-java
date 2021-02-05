package lab1;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Exercise1 {
    private static int num1;
    private static int num2;

    private static void printAddition(){
        int result = num1 + num2;
        System.out.printf("Addition result: %d\n", result);
    }

    private static void printMultiplication(){
        int result = num1 * num2;
        System.out.printf("Multiplication result: %d\n", result);
    }

    private static void printLogicalLeftShift(){
        int result = num1 << num2;
        System.out.printf("Logical Left Shift result: %d\n", result);
    }

    private static void printSquareRoot(){
        double result =  sqrt(num1);
        System.out.printf("Square root of %d result: %f\n", num1, result);
    }

    private static void printSquarePower(){
        int squarePower1 =  num1 * num1;
        int squarePower2 = num2 * num2;
        System.out.printf("Square power of %d: %d\nSquare power of %d: %d\n", num1, squarePower1, num2, squarePower2);
    }


    private static void printResults(){
        System.out.println("---------- EXERCISE 1 ----------");
        printAddition();
        printMultiplication();
        printLogicalLeftShift();
        printSquareRoot();
        printSquarePower();
    }

    public static void runExercise(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide first number");
        num1 = scanner.nextInt();
        System.out.println("Provide second number");
        num2 = scanner.nextInt();
        printResults();
    }
}
