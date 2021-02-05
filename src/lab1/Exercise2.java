package lab1;

import java.util.stream.IntStream;

public class Exercise2 {
    private static int[] array = IntStream.range(0, 31).toArray();

    private static int arrayElementsSum(){
        int sum = 0;
        for (int num: array) {
            sum += num;
        }
        return sum;
    }

    private static void printSum(){
        System.out.printf("Sum of all array elements: %d\n", arrayElementsSum());
    }

    private static void printAverage(){
        double average = arrayElementsSum() / (double) array.length;
        System.out.printf("Array average: %f\n", average);
    }

    private static void printReversedArray(){
        System.out.println("Reversed array");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printExercise2(){
        System.out.println("---------- EXERCISE 2 ----------");
        printAverage();
        printSum();
        printReversedArray();
    }
}
