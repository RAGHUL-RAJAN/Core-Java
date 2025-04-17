package Inheritance;

// Inheritance means one class can use properties and methods of another class. Like how a child inherits traits from a parent

class Animals {

    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animals{

    void bark(){
        System.out.println("Dog barks");
    }

}

class Main{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.sound();
    }
}
