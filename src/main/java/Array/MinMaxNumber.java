package Array;

public class MinMaxNumber {

    public static void main(String[] args) {
        int a[] ={2,4,11,13,4,15,34};
        int max = a[0];
        int min = a[0];

            for(int i=1; i < a.length; i++){

            if(a[i] > max){
                max = a[i];
            }
            if (a[i]< min){
                min = a[i];
            }
        }
        System.out.println("The maximium number is : "+ max);
        System.out.println("The minimium number is : "+ min);
    }

}
