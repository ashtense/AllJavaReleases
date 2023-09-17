package com.ashwani.java8;

import java.io.IOException;

public class ChainedExceptions {

    void simpleException(){
        try {
            throw new ArithmeticException("Top Level Exception");
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    void chainedException(){
        try{
            throw new ArithmeticException("Top Level exception").initCause(new IOException("Bad input received."));
        }catch (Throwable ae){
            System.out.println("Actual exception caught: " + ae);
            System.out.println("Root cause of the exception: " + ae.getCause());
            ae.printStackTrace();
        }
    }

    public static void main(String[] args){
        ChainedExceptions classObject = new ChainedExceptions();
        classObject.simpleException();
        classObject.chainedException();
        // Chained exceptions always result in better logging and easier fault isolation.
    }

}
