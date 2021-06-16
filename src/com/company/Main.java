package com.company;

import java.util.Scanner;

public class Main {

    //Input vragen voor een array, en de desbetreffende elementen weergeven.
    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = new int[10];

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }

    public static void printArray ( int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", typed values was " + array[i]);
        }
//        System.out.println("The average is " + getAverage(array));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }

    //Getting the average of the whole array
//    public static double getAverage(int[] array){
//        int sum = 0;
//        for(int i=0; i< array.length; i++){
//            sum += array[i];
//        }
//        return (double) sum / (double)array.length;
//    }



    //De sorting funtie.
    //Door een hulpvariabel en -array aan te maken verander je de initiele values niet.
    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int i =0; i < sortedArray.length -1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag=true;
                }
            }
        }
        return sortedArray;
    }

    //Resizing and returning original elements
    private static void resizeArray() {
        int[] original = baseData;

        baseData = new int[12];
        for(int i=0; i < original.length; i++){
            baseData[i] = original[i];
        }
    }

}
