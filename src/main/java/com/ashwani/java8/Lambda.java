package com.ashwani.java8;

public class Lambda {

    @FunctionalInterface
    interface Operations<T>{
        T process(T a,T b);
    }

    public void makeSolidImplementationsOfAnInterface(){
        /*This is one of the ways of using lambda functions.
        You can make solid implementations of an interface without making specific classes and all the OO things around.*/
        Operations<Integer> addIntegers = (a,b) -> a + b;
        System.out.println(addIntegers.process(2, 5));

        Operations<String> appendStrings = (a,b) -> a + " : " + b;
        System.out.println(appendStrings.process("Ashwani", "Solanki"));
    }

    public static void main(String[] args) {
        Lambda classObject = new Lambda();
        classObject.makeSolidImplementationsOfAnInterface();
    }
}
