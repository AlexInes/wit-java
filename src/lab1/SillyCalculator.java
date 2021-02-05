package lab1;

import static java.lang.Math.sqrt;

public class SillyCalculator {

    public int num1;
    public int num2;

    public SillyCalculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    private void printAddition(){
        int result = num1 + num2;
        System.out.printf("Addition result: %d\n", result);
    }

    private void printMultiplication(){
        int result = num1 * num2;
        System.out.printf("Multiplication result: %d\n", result);
    }

    private void printLogicalLeftShift(){
        int result = num1 << num2;
        System.out.printf("Logical Left Shift result: %d\n", result);
    }

    private void printSquareRoot(){
        double result =  sqrt(num1);
        System.out.printf("Square root of %d result: %f\n", num1, result);
    }

    private void printSquarePower(){
        int squarePower1 =  num1 * num1;
        int squarePower2 = num2 * num2;
        System.out.printf("Square power of %d: %d\nSquare power of %d: %d", num1, squarePower1, num2, squarePower2);
    }

    public void printResults(){
        printAddition();
        printMultiplication();
        printLogicalLeftShift();
        printSquareRoot();
        printSquarePower();
    }
}
