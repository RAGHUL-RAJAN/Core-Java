package Class_Object;

public class Employee {

    //    variable
    int eid;
    String eName;
    String job;
    int sal;

    //    method
    void display() {
        System.out.println(eid);
        System.out.println(eName);
        System.out.println(job);
        System.out.println(sal);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.eid = 100;
        emp.eName = "Jack";
        emp.job = "Manager";
        emp.sal = 50000;

        emp.display();
    }

}
