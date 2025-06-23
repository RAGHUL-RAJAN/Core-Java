package Problems;

public class MaxNumber {
    public static void main(String[] args) {

        int[] number = {3, 0, 1, 4, 5, 9, 6, 2};
        int max = number[0];

        for (int num : number) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max number :"+ max);
    }
}
