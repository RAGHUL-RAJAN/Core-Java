package Problems;

import java.util.Scanner;

public class LargestOfThreeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Fist number");
        int A = sc.nextInt();

        System.out.println("Enter the Second number");
        int B = sc.nextInt();

        System.out.println("Enter the Third number");
        int C = sc.nextInt();

        if(A>B && A>C){
            System.out.println("A is the largest number");
        } else if(B>A && B>C){
            System.out.println("B is the largest number");
        }else{
            System.out.println("C is the largest number");
        }
    }
}
