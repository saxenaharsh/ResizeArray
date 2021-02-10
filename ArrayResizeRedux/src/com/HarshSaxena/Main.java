package com.HarshSaxena;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = new int[10];

    public static void main(String[] args) {
        System.out.println("Enter 10 numbers");
        getInput();
        printArray(baseData);
        resizeArray();
        System.out.println("Enter 12 numbers");
        baseData[10] = 64;
        baseData[11] = 32;
        printArray(baseData);

    }
    private static void getInput(){
        for(int i = 0; i < baseData.length; i++){
            baseData[i] = scanner.nextInt();
        }
    }
    private static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
            System.out.println();
        }
    }
    private static void resizeArray(){
        int[] original = baseData;
        baseData = new int[12];
        for(int i = 0; i < original.length; i++){
            baseData[i] = original[i];
        }
    }
}
