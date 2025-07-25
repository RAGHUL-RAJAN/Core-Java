package Problems;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        if (checkAnagram("teeth","eetth")){
            System.out.println("Given word is Anagram");
        }else{
            System.out.println("Given word is not Anagram");
        }
    }
    public static boolean checkAnagram(String a, String b){
        a = a.replaceAll("\\s","").toLowerCase();
        b = b.replaceAll("\\s","").toLowerCase();

        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);
        return Arrays.equals(a1,b1);
    }
}
