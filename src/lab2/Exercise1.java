package lab2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Exercise1 {


    private static int num1 = 0;
    private static int num2 = 0;

    public static void readUserData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide first number");
        num1 = scanner.nextInt();
        System.out.println("Provide second number");
        num2 = scanner.nextInt();
    }

    private static int addition(){
        return num1 + num2;
    }

    private static int multiplication(){
        return num1 * num2;
    }

    private static int logicalLeftShift(){
        return num1 << num2;
    }

    private static double squareRoot(){
        return sqrt(num1);
    }

    private static String squarePower(){
        int squarePower1 =  num1 * num1;
        int squarePower2 = num2 * num2;
        return "\tPower of " + num1 + " is " + squarePower1 + "\n" + "\tPower of " + num2 + " is " + squarePower2;
    }

    private static void printResultsToFile() throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("E:\\WIT\\MirMail\\WIT\\labs\\file.txt");
        writer.write("Numbers: " + num1 + ", " + num2 + "\n");
        writer.write("Addition result: " + addition() + "\n");
        writer.write("Multiplication result: " + multiplication() + "\n");
        writer.write("Logical Left Shift result: " + logicalLeftShift() + "\n");
        writer.write("Square root result: " + squareRoot() + "\n");
        writer.write("Square power result: \n" + squarePower() + "\n");
        writer.close();

    }

    public static void runExercise1() throws FileNotFoundException {
        readUserData();
        printResultsToFile();
    }
}
