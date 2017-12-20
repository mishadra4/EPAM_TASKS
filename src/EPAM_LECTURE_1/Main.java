package EPAM_LECTURE_1;

import EPAM_LECTURE_1.FibonacciNumbers;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
        ArrayList list = (ArrayList)fibonacciNumbers.generateFibonacci(13);
        System.out.println("Fibonacci numbers:");
        for (Object i: list) {
            System.out.println((Integer)i);
        }
        Numbers numbers = new Numbers();
        numbers.inputNumbers();
        numbers.sortNumbers();
        numbers.printIfCanDivideOnPrev();
        numbers.printNumbersWithUpDigits();
        numbers.printIfHasSimpleNumbers();
    }
}
