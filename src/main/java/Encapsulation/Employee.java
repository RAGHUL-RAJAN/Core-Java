package Encapsulation;

class Employee {
    private String name = "Raghul";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Office{
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println(emp.getName());

        emp.setName("RaghulRajan");
        System.out.println(emp.getName());
    }
}
