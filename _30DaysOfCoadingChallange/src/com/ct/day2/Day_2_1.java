package com.ct.day2;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// Topic - Functional Interface
// A functional interface is an interface that contains only ONE abstract method.
// It can have multiple default or static methods, but only one abstract method.
// These are mainly used in lambda expressions and method references

public class Day_2_1 {
    public static void main(String[] args) {

        // 1. Predicate<T>
        // - Method: test(T t)
        // - Takes one argument and returns a boolean.
        // - Example use: checking conditions like "is number > 10".
        Predicate<Integer> predicate = (t) -> t > 10;
        boolean result = predicate.test(20);
        System.out.println("Predicate's test method : " + result);

        // 2. Consumer<T>
        // - Method: accept(T t)
        // - Takes one argument and returns nothing (void).
        // - Example use: printing values or updating objects.
        Consumer<String> consumer = (t) -> System.out.println("Consumer's accept method : " + t);
        consumer.accept("Hello, Chetan!");

        // 3. Supplier<T>
        // - Method: get()
        // - Takes no argument and returns a value.
        // - Example use: generating or supplying values (like random numbers).
        Supplier<Double> supplier = () -> Math.random();
        System.out.println("Supplier's get method : " + supplier.get());

        // 4. Function<T,R>
        // - Method: apply(T t)
        // - Takes one argument and returns a result.
        // - Example use: converting one type to another (like String length).
        Function<String, Integer> function = (str) -> str.length();
        System.out.println("Function's apply method : " + function.apply("Java"));

        // 5. BiPredicate<T,U>
        // - Method: test(T t, U u)
        // - Takes two arguments and returns a boolean.
        // - Example use: comparing two values.
        BiPredicate<Integer, Integer> biPredicate = (x, y) -> x > y;
        System.out.println("BiPredicate's test method : " + biPredicate.test(20, 10));

        // 6. BiConsumer<T,U>
        // - Method: accept(T t, U u)
        // - Takes two arguments and returns nothing (void).
        // - Example use: processing two values together.
        BiConsumer<String, Integer> biConsumer = (name, age) ->
        System.out.println("BiConsumer's accept method : " + name + " is " + age + " years old");
        biConsumer.accept("Chetan", 25);

        // 7. BiFunction<T,U,R>
        // - Method: apply(T t, U u)
        // - Takes two arguments and returns a result.
        // - Example use: combining two values to produce a result.
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;
        System.out.println("BiFunction's apply method : " + biFunction.apply(10, 20));

        // 8. BooleanSupplier
        // - Method: getAsBoolean()
        // - Takes no argument and returns a boolean.
        // - Example use: supplying a true/false value.
        BooleanSupplier boolSupplier = () -> 5 > 3;
        System.out.println("BooleanSupplier's getAsBoolean method : " + boolSupplier.getAsBoolean());
    }
}