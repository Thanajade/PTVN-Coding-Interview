package com.pantavanij;

import java.util.Arrays;

/*
Solve these problem with any IDE, code editor you like within 15 minutes. Open environment. Use any tools possible.
    1. Sort Array of numbers [1,5,2,2,5,4,7,9] expected output [1,2,2,4,5,5,7,9]
    2. Sum Amount of array
    3. Median value of the Array Median = middle position of the sorted array, if length is even number, middle means the average of middle 2 number
      */

public class App {
    public static void main(String[] args) {
        int[] givenNumbers = new int[]{1, 5, 2, 2, 5, 4, 7, 9};

        int[] answer1 = sorted(givenNumbers);
        int answer2 = summation(givenNumbers);
        double answer3 = median(givenNumbers);

        System.out.printf("Answer 1: %s%n", Arrays.toString(answer1));
        System.out.printf("Answer 2: %s%n", answer2);
        System.out.printf("Answer 3: %s%n", answer3);
    }

    public static int[] sorted(int[] unsorted) {
        // implement logic here
        Arrays.sort(unsorted);
        return unsorted;
    }

    public static int summation(int[] numbers) {
        // implement logic here
        return Arrays.stream(numbers).sum();
    }

    public static double median(int[] numbers) {
        // implement logic here
        Arrays.sort(numbers);
        int length = numbers.length;
        int mid = length/2;
        if(length%2 == 0) { // even
          return numbers[mid]/numbers[mid+1];
        } else {
          return numbers[mid];
        }
    }
}
