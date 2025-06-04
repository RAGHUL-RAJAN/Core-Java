package Problems;

public class stringToArray {
    static String str = "india";

    public static void main(String args[]){
        char[] charArray = str.toCharArray();
        for(char ch : charArray){
            System.out.println(ch);
        }

    }
}
