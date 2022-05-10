package com.pantavanij;

import java.util.Arrays;

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
        return new int[]{
                1, 2, 2, 4, 5, 5, 7, 9
        };
    }

    public static int summation(int[] numbers) {
        // implement logic here
        return 35;
    }

    public static double median(int[] numbers) {
        // implement logic here
        return 4.5d;
    }
}
