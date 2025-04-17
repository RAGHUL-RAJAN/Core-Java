package Projects;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void isDisplayed() {
        System.out.println("Name:" + name + " Roll No:" + rollNo);
    }
}


class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner nw = new Scanner(System.in);
        String correctUserName = "admin123";
        String correctPwd = "12345";
        boolean loggedIn = false;
        System.out.println("Welcome to Student Management system");

        for (int i =0 ; i<= 3; i++){
            System.out.println("Enter the UserName");
            String userName = nw.nextLine();
            System.out.println("Enter the Password");
            String password = nw.nextLine();
            if(userName.equals(correctUserName) && password.equals(correctPwd)){
                System.out.println("Login Successful");
                loggedIn = true;
                break;
            }else{
                System.out.println("Incorrect credentials");
            }
        }
        if(!loggedIn){
            System.out.println("To many attempt please try again later..");
            nw.close();
            return;
        }

        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Management System ");

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search student by name");
            System.out.println("4. Edit Roll Number");
            System.out.println("5. Enter the roll number to delete");
            System.out.println("6. Show total students");
            System.out.println("7. Save students to File");
            System.out.println("8. Exit");
            System.out.println("choose an option (1-8) :");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.println("Enter the name ");
                String name = sc.nextLine();

                System.out.println("Enter the roll number");
                int rollNo = sc.nextInt();
                sc.nextLine();

                Student s = new Student(name, rollNo);
                students.add(s);
                System.out.println("Student added successful");

            } else if (choice == 2) {

                System.out.println("All Students");
                for (Student s : students) {
                    s.isDisplayed();
                }

            } else if (choice == 3) {

                System.out.println("Search for the name");
                String searchName = sc.nextLine();
                boolean found = false;

                for (Student s : students) {
                    if (s.getName().equalsIgnoreCase(searchName)) {
                        s.isDisplayed();
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("No Student found with the name " + searchName);
                }

            } else if (choice == 4) {
                System.out.println("Enter the roll number of the student to edit");
                int editRoll = sc.nextInt();
                sc.nextLine();
                boolean edit = false;
                for (Student s : students) {

                    if (s.getRollNo() == editRoll) {

                        System.out.println("Enter the new Name : ");
                        String newName = sc.nextLine();
                        System.out.println("Enter the new Roll number : ");
                        int newRoll = sc.nextInt();
                        sc.nextLine();
                        students.remove(s);
                        students.add(new Student(newName, newRoll));
                        System.out.println("Student updated");
                        edit = true;
                        break;
                    }
                }
                if (!edit) {
                    System.out.println("Student Not Found");
                }
                break;

            } else if (choice == 5) {
                System.out.println("Enter the roll number to delete");
                int deleteRoll = sc.nextInt();
                sc.nextLine();
                boolean deleted = false;
                for (Student s : students) {
                    if (s.getRollNo() == deleteRoll) {
                        students.remove(s);
                        System.out.println("Student deleted");
                        deleted = true;
                        break;
                    }
                }
                if (!deleted) {
                    System.out.println("Student not found");
                }
                break;

            } else if (choice == 6) {
                System.out.println("Total number of students : " + students.size());
                break;
            } else if (choice == 7) {
                try {
                    FileWriter writer = new FileWriter("students.txt");
                    for (Student s : students){
                        writer.write(s.getName()+ ","+s.getRollNo()+"\n");
                    }
                    writer.close();
                    System.out.println("Students saved to students.txt");
                }catch (IOException e) {
                    System.out.println("Error saving files "+ e.getMessage());
                }
                break;
            } else if (choice == 8) {
                System.out.println("Exiting... Bye!");
                break;
            }else {
                System.out.println("Invalid choice. Try again!");
            }
        }
        sc.close();
    }
}
