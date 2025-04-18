package Array;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        int a[][] = new int[3][2];
        a[0][0] = 100;
        a[0][1] = 200;
        a[1][0] = 300;
        a[1][1] = 400;
        a[2][0] = 500;
        a[2][1] = 600;

//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[0].length; j++) {
//                System.out.println(a[i][j]);
//            }
//        }

        int b[][] = {{101, 102},
                {201, 202},
                {301, 302}
        };

//        for (int i = 0; i < b.length; i++) {
//            for (int j = 0; j < b[0].length; j++) {
//                System.out.print(b[i][j]+ " ");
//            }
//            System.out.println( );
//        }

        for (int arr[] : b) {
            for (int x : arr) {
                System.out.println(x);
            }
        }
    }
}
