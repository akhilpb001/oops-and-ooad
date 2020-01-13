package com.udemy.learning.oops.prerequisites;

public class Fan {
    private boolean isOn;
    public static int staticCounter;

    public Fan() {
    }

    public Fan(boolean isOn) {
        this.isOn = isOn;
    }

    public void incrementStaticCounter() {
        staticCounter++;
    }

    public static int getStaticCounter() {
        return staticCounter;
    }

    public void turnOn() {
        System.out.println("Tuning on the fan...");
        this.isOn = true;
    }

    public void turnOff() {
        System.out.println("Tuning off the fan...");
        this.isOn = false;
    }

    public void checkFanStatus() {
        if (this.isOn) {
            System.out.println("Fan is on!");
        } else {
            System.out.println("Fan is off!");
        }
    }

    protected void repairFan() {
        this.turnOff();
        System.out.println("Fan is being repaired...");
    }
}
