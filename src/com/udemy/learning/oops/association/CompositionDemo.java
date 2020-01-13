package com.udemy.learning.oops.association;

// Association: HAS-A Relationship
// Ex: Collage HAS-A Teacher
// Ex: Office HAS-A Employee

// Two type of association
// 1. Aggregation
// 2. Composition
//      a. Stronger form of association
//      b. Two entities are highly dependent on each other
//      c. Here


class House {
    private Kitchen kitchen;

    public House() {
        kitchen = new Kitchen();
        kitchen.setFood("Pizza");
    }

    public String getFood() {
        return kitchen.getFood();
    }
}

class Kitchen {
    private String food;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        House house = new House();
        System.out.println(house.getFood());
    }
}
