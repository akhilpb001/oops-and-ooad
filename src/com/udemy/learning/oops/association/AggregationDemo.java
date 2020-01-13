package com.udemy.learning.oops.association;

// Association: HAS-A Relationship
// Ex: Collage HAS-A Teacher
// Ex: Office HAS-A Employee

// Two type of association
// 1. Aggregation
//      a. Weaker form of association
//      b. Two entities are not highly dependent on each other
//      c. Here Teacher class can exits without Collage class
// 2. Composition


import java.util.ArrayList;
import java.util.List;

class Collage {
    String name;
    private List<Teacher> teachers;

    public Collage(String name, List<Teacher> teachers) {
        this.name = name;
        this.teachers = teachers;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
}

class Teacher {
    String name;
    String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "[Teacher: " + name + ", Subject: " + subject + "]";
    }
}


public class AggregationDemo {
    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Rohn","Java"));
        teachers.add(new Teacher("John","Python"));

        Collage collage = new Collage("My Collage", teachers);
    }
}
