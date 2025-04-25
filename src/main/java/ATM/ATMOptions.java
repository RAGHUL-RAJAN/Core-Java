package ATM;

import java.util.Scanner;

public class ATMOptions {
    private double balance = 1000.00;
    private String pin = "12345";
    private String mobileNumber = "9090908789";

    void showOptions(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("\nATM Menu");
            System.out.println("1. Balance Enquiry");
            System.out.println("2. Withdrawal Cash");
            System.out.println("3. Change Pin");
            System.out.println("4. Change Mobile number");
            System.out.println("5. Exit");
            System.out.print("Enter your choice");

            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    
            }
        }
    }
}
