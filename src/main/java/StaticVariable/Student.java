package StaticVariable;

public class Student {
    String school = "ABC Matric Hr Sec School";
    String name;

    Student(String n){
        name = n;
    }

    void show(){
        System.out.println( name  + "goes to "+ school);
    }
}
