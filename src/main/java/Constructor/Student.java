package Constructor;

// A constructor is a special method used to create an object and set values.

public class Student {
    String name;

    Student(String n){
        name = n;
    }

   void isDisplay(){
        System.out.println("Name of the student is "+ name);
    }
}



