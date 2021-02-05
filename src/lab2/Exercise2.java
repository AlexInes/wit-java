package lab2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Exercise2 {
    private static String wordToCheck = "";

    public static void readWordToCheck(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide a word to check:");
        String word = scanner.nextLine();
        wordToCheck = word;
    }

    private static boolean checkIfPalindrome(){
        String temp  = wordToCheck.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, temp.length() / 2)
                .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
    }

    private static void isPalindrome(){
        if(checkIfPalindrome() == true){
            System.out.printf("%s is a palindrome\n", wordToCheck );
        } else {
            System.out.printf("%s is not a palindrome\n", wordToCheck);
        }
    }

    public static void runExercise(){
        System.out.println("---------- EXERCISE 2 ----------");
        readWordToCheck();
        isPalindrome();
    }
}
