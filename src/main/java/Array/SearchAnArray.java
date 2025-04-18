package Array;

import java.util.Scanner;

public class SearchAnArray {
    public static void main(String[] args) {
        int a[] ={1,2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number between the range 1 - 10");
        int given = sc.nextInt();
        boolean found = false;

       for(int i=0;i<a.length;i++){
           if(given == a[i]){

               found = true;
               break;
           }
       }
       if(found)
           System.out.println("Given number is inside the Array");
       else
        System.out.println("Given number is not inside the Array");
    }
}
