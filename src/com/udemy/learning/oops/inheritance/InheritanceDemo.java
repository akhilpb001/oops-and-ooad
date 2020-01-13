package com.udemy.learning.oops.inheritance;

// Inheritance: IS-A Relationship
// Ex: Manager IS-A Employee
// Ex: Developer IA-A Employee


// Type 1: Single Inheritance
// Parent/Base/Super class
class A {
}

// Child/Derived/Sub class
class B extends A {
}


// Type 2: Multilevel Inheritance
class C extends B {
}


// Type 3: Multiple Inheritance - more than one parent
// Note: Not possible in Java using classes, but possible using interfaces
interface AA {
    default void method() {
        System.out.println("Method of AA");
    }
}

interface BB {
    default void method() {
        System.out.println("Method of BB");
    }
}

class CC implements AA, BB {
    @Override
    public void method() {
        AA.super.method();
        BB.super.method();
        System.out.println("Overriden method of CC");
    }
}


// Type 4: Hierarchical Inheritance - single parent, more than one children
class AAA {
}

class BBB extends AAA {
}

class CCC extends AAA {
}


// Type 5: Hybrid Inheritance - combination of Multiple and Multilevel Inheritance
// Note: Not possible in Java


// Type 6: Cyclic Inheritance - Not Allowed and Not Required


public class InheritanceDemo {
    public static void main(String[] args) {
    }
}
