package Problems;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 10, count = 0;

        if (num > 1) {
            for(int i =1; i<=num;i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if(count ==2){
                System.out.println(" its a Prime Number");
            }else{
                System.out.println("Not a prime Number");
            }
        } else {
            System.out.println("Its not Palindrome number");
        }
    }
}
