package Encapsulation;

public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Main{
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("Jack");
        System.out.println(st.getName());   // Output: Jack
    }
}


