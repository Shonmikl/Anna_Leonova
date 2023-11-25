package org.example._2023_11_25;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;

public class StrEx1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Arrays.stream(array)
                .filter(el -> el % 2 == 0)
                .map(el -> el * 10)
                .forEach(System.out::println);
    }
}
