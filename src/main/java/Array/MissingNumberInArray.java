package Array;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 4, 5, 6};
        int n = a.length + 1;
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;

        for(int i =0; i<a.length;i++){
            actualSum = actualSum + a[i];
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println(missingNumber);

    }
}
