package com.ashwani.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsAndComparator {

    public static void main(String[] args) {

        /* Making streams from a simple array
        Stream<Integer> stream = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
        stream.forEach(p -> System.out.println(p));*/

        List<Integer> lstIntegers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        /* Filtering out elements from a list and collecting them in another list.
        List<Integer> lstEvenIntegers = lstIntegers.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
        lstEvenIntegers.forEach(System.out::println);*/

        /* Filtering out elements from a list and collecting to a native array
        Integer[] arrEvenIntegers = lstIntegers.stream().filter(i -> i % 2 == 0).toArray(Integer[]::new);
        Arrays.stream(arrEvenIntegers).forEach(System.out::println);*/

        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        /* Filter names starting with S
        Set<String> s = memberNames.stream().filter(name -> name.startsWith("S")).collect(Collectors.toSet());
        s.forEach(System.out::println);*/

        /* Map and transform the elements within a stream.
        Doesn't affect the parent array as stream doesn't touch the collection.
        Set<String> upperCaseNames = memberNames.stream().filter(name -> name.startsWith("Y"))
                .map(name -> name.toUpperCase()).collect(Collectors.toSet());
        upperCaseNames.forEach(System.out::println);*/

        /* String sorting. Custom comparator can be given in sorted method call.
        If no comparator provided natural order for sorting using comparable interface is done.

        memberNames.stream().forEach(System.out::print);
        System.out.println();
        Comparator nameComparator = Comparator.naturalOrder();
        memberNames.stream().sorted(nameComparator).forEach(System.out::print);*/

        Optional<String> reduce = memberNames.stream().reduce((n1, n2) -> n1 + " : " + n2);
        reduce.ifPresent(System.out::println);

        Optional<String> reduceByParallelStreams = memberNames.parallelStream().reduce((n1, n2) -> n1 + " : " + n2);
        reduceByParallelStreams.ifPresent(System.out::println);
    }

}