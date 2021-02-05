package com.company;
import lab1.Exercise1;
import lab1.Exercise2;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //runLab1();
        runLab2();
    }

    public static void runLab1(){
        System.out.println("-------------------------------------------");
        System.out.println("                  LAB 1                    ");
        System.out.println("-------------------------------------------");
        lab1.Exercise1.runExercise();
        lab1.Exercise2.printExercise2();
    }

    public static void runLab2() throws FileNotFoundException {
        System.out.println("-------------------------------------------");
        System.out.println("                  LAB 2                    ");
        System.out.println("-------------------------------------------");
        lab2.Exercise1.runExercise1();
        lab2.Exercise2.runExercise();
    }

}
