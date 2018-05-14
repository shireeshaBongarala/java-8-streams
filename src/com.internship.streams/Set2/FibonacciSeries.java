package com.internship.streams.Set2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciSeries {
    /* print the first n fibonacci numbers*/
    public static void main(String[] args) {
        List<Integer> sumOfFirstNNaturalNumbers = generateFirstNNaturalNumbers();
        System.out.println(sumOfFirstNNaturalNumbers);

        List<Integer> firstNFibonacciNumbers = getNFibonacciNumbers(10);
        System.out.println(firstNFibonacciNumbers);
    }

    private static List<Integer> generateFirstNNaturalNumbers() {
            return Stream.iterate(1, s -> s+1).limit(10).collect(Collectors.toList());
    }


    private static List<Integer> getNFibonacciNumbers(int x) {
        return new ArrayList<>();
    }
}
