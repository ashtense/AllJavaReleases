package com.ashwani.java8;

import com.ashwani.algos.Fibonacci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lambda {

    @FunctionalInterface
    interface Operations<T> {
        T process(T a, T b);
    }

    public void makeSolidImplementationsOfAnInterface() {
        /*This is one of the ways of using lambda functions.
        You can make solid implementations of an interface without making specific classes and all the OO things around.*/
        Operations<Integer> addIntegers = (a, b) -> a + b;
        System.out.println(addIntegers.process(2, 5));

        Operations<String> appendStrings = (a, b) -> a + " : " + b;
        System.out.println(appendStrings.process("Ashwani", "Solanki"));
    }

    public void iterateOverList() {
        List<String> lstName = new ArrayList<>();
        lstName.add("Ashwani");
        lstName.add("Solanki");

        lstName.forEach(name -> System.out.println(name));
    }

    public void createThread() {
        Thread fibonnaciThread = new Thread(() -> {
            // fibonacci
            Fibonacci fibonacci = new Fibonacci();
            Arrays.stream(fibonacci.getFibonacciSeries(9)).forEach(System.out::println);
        });
        List lstNum = new ArrayList();
    }

    public void predicates(Integer[] arrNums) {
        Predicate<Integer> isOdd = i -> i % 2 != 1;
        Predicate<Integer> isEven = isOdd.negate();
        Arrays.stream(arrNums).filter(isOdd).forEach(System.out::println);
        Arrays.stream(arrNums).filter(isEven).forEach(System.out::println);
    }

    public static void main(String[] args) {
        Lambda classObject = new Lambda();
//        classObject.makeSolidImplementationsOfAnInterface();
//        classObject.iterateOverList();
//        classObject.createThread();
        classObject.predicates(new Integer[]{1, 2, 3, 5, 8, 22});
    }
}
