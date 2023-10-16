package com.ashwani.java8;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        Optional<String> strOptional = Optional.of("Ashwani Solanki");
        strOptional.ifPresent(System.out::println);
        Optional<Object> objOptional = Optional.empty();
        objOptional.ifPresent(System.out::println);
    }
}
