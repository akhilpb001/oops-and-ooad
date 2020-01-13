package com.udemy.learning.oops.prerequisites;

public abstract class Department {
    public abstract int getEmployee();

    public abstract void method();

    public void attendence() {
        System.out.println("I am present in Department abstract class");
    }
}

class DeptOne extends Department {

    @Override
    public int getEmployee() {
        return 100;
    }

    @Override
    public void method() {
        System.out.println("This is implementation of method");
    }

    @Override
    public void attendence() {
//        super.attendence();
        System.out.println("I am present in DeptOne class");
    }
}

class DeptExecutor {
    public static void main(String[] args) {
        DeptOne deptOne = new DeptOne();
        int emps = deptOne.getEmployee();
        System.out.println("Department One has " + emps + " employees");
        deptOne.method();
        deptOne.attendence();
    }
}