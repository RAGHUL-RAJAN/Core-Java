package Class_Object;

public class Student {

    //    variable
    int sid;
    String sName;
    String grade;

    //    method
    void display() {
        System.out.println(sid);
        System.out.println(sName);
        System.out.println(grade);
    }

    public static void main(String[] args) {
//  without using referrance variable for an object
        new Student().sid = 101;
        new Student().sName = "John";
        new Student().grade = "A+";
        new Student().display();

    }
}
