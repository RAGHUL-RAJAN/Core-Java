package ATM;

import java.util.Scanner;

public class Atm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        login lg = new login();
        System.out.println("Enter the card number");
        String card = sc.next();
        System.out.println("Enter the pin number ");
        String pin = sc.next();

        if(lg.credentials(card,pin)){

        }else{
            InvalidUser.Errmsg();
        }

    }
}
