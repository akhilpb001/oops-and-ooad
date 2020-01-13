package com.udemy.learning.oops.prerequisites;

public final class FinalAndStaticDemo {
    // Final classes can not be inherited.
    // Final methods can not be overriden.
    // Final variables can not be reassigned.

    // Static variable is created only once in the memory.
    // Static method is created only once in the memory.
    // Static methods can access only static variables.

    private static final String name = "John!";

    public static final void sayHello() {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        System.out.println("FinalAndStaticDemo is a final class");
        FinalAndStaticDemo.sayHello();
    }
}
