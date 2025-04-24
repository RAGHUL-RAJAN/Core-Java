package Problems;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
//        int m = 3;
//        int n = 5;
//
//        for (int i =1; i<=n;i++){
//            System.out.println(m +" * "+i+" = "+ m*i);
//        }

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for( int i =1; i<=b;i++){
            System.out.println(a+" * "+i+" = "+ a*i );
        }
    }

}
