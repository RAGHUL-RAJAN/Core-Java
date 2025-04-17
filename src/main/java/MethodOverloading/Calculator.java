package MethodOverloading;

// Method overloading means having many methods with the same name but different types or numbers of input.

public class Calculator {

    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }
}

class Main{
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(5,5));
        System.out.println(c.add(12.5,12.5));
    }
}
