package Array;

/*
Single Dimensional array :
    1. Declare an array
    2. add value to an array
    3. Find the size of an array
    4. read the single value from the array
    5. read multiple value from the array
 */

public class SingleDimensionalArray {
    public static void main(String[] args) {

        int a[] = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

//        for(int i =0; i<a.length;i++){
//                System.out.println(a[i]);
//        }

        for (int x : a){
            System.out.println(x);
        }
    }
}
