package Array;

import java.util.Scanner;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int a[] = {10,20,30,45,20,4,20};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any two digit number :");
        int given = sc.nextInt();
        int duplicateCount =0;

        for(int i = 0;i<a.length;i++){
            if(given == a[i]){
                duplicateCount++;

            }
        }
        System.out.println("The count of the duplicate number is : "+ duplicateCount);
    }
}
