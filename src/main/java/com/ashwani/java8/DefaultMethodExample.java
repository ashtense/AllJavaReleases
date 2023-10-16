package com.ashwani.java8;

interface Animal{
    default void move(){
        System.out.println("Interface's default implementation.");
    }

    static void testMe(){
        System.out.println("Ashwani Solanki");
    }
}

class Tiger implements Animal{
//    @Override
//    public void move() {
//        System.out.println("Tiger is moving");
//    }

}
public class DefaultMethodExample {
    public static void main(String[] args) {
        Tiger tigerObject = new Tiger();
        tigerObject.move();
        Animal.testMe();
    }
}
