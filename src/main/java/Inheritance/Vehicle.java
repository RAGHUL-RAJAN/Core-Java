package Inheritance;

/*
Inheritance is one of the OOP concepts in java, we can inherit methods and variable form one class to another
class using extends keyword

    subClass - the class that inherit from another class
    superClass - the class being inherited
 */

class Vehicle {
    protected String brand = "ford";
    void sound(){
        System.out.println("forddddddddddddd");
    }
}

class Car extends Vehicle{
    String carName = "Mustang";
    public static void main(String[] args) {
        Car cr = new Car();
        System.out.println(cr.brand);
        cr.sound();
        System.out.println(cr.carName);
    }
}