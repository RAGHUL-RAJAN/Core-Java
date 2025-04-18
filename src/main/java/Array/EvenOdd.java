package Array;

public class EvenOdd {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        int evencount = 0,oddcount =0;

        for(int i =0;i<a.length;i++){
            if(a[i]%2 ==0){
                evencount++;
            }else{
                oddcount++;
            }
        }

        System.out.println(" Even "+ evencount);
        System.out.println("Odd "+ oddcount);

    }
}
