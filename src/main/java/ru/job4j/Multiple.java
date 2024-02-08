package ru.job4j;

import java.util.stream.IntStream;

public class Multiple {
    public static void main(String[] args) {
        IntStream.iterate(1, x -> x < 10, x -> x + 1).forEach(x -> System.out.println(String.format("1 * %d = %d", x, 1 * x)));
    }
}
