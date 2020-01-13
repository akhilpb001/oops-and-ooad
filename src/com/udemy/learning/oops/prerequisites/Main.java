package com.udemy.learning.oops.prerequisites;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.turnOn();
        fan1.checkFanStatus();
        fan1.turnOff();
        fan1.checkFanStatus();

        System.out.println(Fan.staticCounter);
        System.out.println(fan1.staticCounter);

        fan1.incrementStaticCounter();

        Fan fan2 = new Fan(true);
        System.out.println(fan2.staticCounter);

        fan2.incrementStaticCounter();

        System.out.println(Fan.getStaticCounter());
        System.out.println(fan2.getStaticCounter());

        fan2.repairFan();

        Havells havells = new Havells();
        havells.checkFanStatus();
        havells.repairFan();
    }
}
