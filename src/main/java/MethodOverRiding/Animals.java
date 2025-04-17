package MethodOverRiding;

public class Animals {
    void sound(){
        System.out.println("Animals make sound");
    }
}

class Cat extends Animals{
    void sound(){
        System.out.println("Meow");
    }
}

class Main{
    public static void main(String[] args) {
       Animals a = new Cat(); // Animal reference, Cat object
       a.sound(); // Output: Meow (Cat’s version runs)
    }
}