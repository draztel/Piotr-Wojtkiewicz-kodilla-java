package com.kodilla.stream;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(i -> numbers[i])
                .forEach(System.out::print);

       double optionalAverageNumbers = IntStream.range(0, numbers.length)
               .map(i -> numbers[i])
               .average().getAsDouble();
       return optionalAverageNumbers;
    }
}
