package com.ashwani.java8;

public class MatchClassChangesExample {

    public void exactMaths() {
        // This will print wrong output as integer's limit is crossed.
        // Still it will go unnoticed.
        System.out.println(100000 * 100000);
        // Here we get an explicit mention of the mistake made.
        // Similar exact function is present for other mathematical operations as well.
//        Math.multiplyExact(100000, 100000);
        // Conversion of long to integer is also prone to overflow/underflow problems.
        // This problem can be solved by using below
        System.out.println("Converting long to integer: " + (int) Long.MAX_VALUE + ". Gives entirely wrong result");
//        System.out.println("Converting long to integer: " + Math.toIntExact(Long.MAX_VALUE) + ". Correct exception thrown");
        // Number lesser and closer to a given number.
        System.out.println(Math.nextDown(11.45));
    }

    public void modProblem() {
        System.out.println(10 % 2);
        System.out.println(11 % 2);
        System.out.println(-13 % 2);
        System.out.println(-14 % 2);
        // In modulus operation negative response isn't needed.
        // Hence, floorMod protects against negative response as well.
        System.out.println(Math.floorMod(-13, 2));
    }

    public static void main(String[] args) {
        MatchClassChangesExample classObject = new MatchClassChangesExample();
        classObject.exactMaths();
//        classObject.modProblem();
    }
}