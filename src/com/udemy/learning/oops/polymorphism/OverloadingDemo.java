package com.udemy.learning.oops.polymorphism;

// Polymorphism: Two types
//      - Method Overloading
//      - Method Overriding

// Method Signature:
//      - <Method Name>(<Argument List>)
//      - Return type is not part of method signature
//      - Ex: public String display(String info) => display(String) [method signature]

// Method Overloading:
//      - Same method name, but different argument list
//      - Also called Compile time Polymorphism or Early Binding

// Widening or Automatic Type Conversion in Java:
//      - byte -> short -> int -> long -> float -> double
//      - char -> int

// Narrowing or Explicit Conversion in Java:
//      - double -> float -> long -> int -> short -> byte


class Addition {
    public void sum(int a, int b) {
        System.out.println("Sum is: " + (a + b));
    }

    public void sum(double a, double b) {
        System.out.println("Sum is: " + (a + b));
    }

    public void sum(int a, int b, int c) {
        System.out.println("Sum is: " + (a + b + c));
    }
}

public class OverloadingDemo {
    public static void main(String[] args) {
        Addition add = new Addition();
        add.sum(10, 15);
        add.sum(10,15, 25);
        add.sum(10.25, 15.75);
        add.sum(23.45f, 20.25);
    }
}
