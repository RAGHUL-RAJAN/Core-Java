package String;

public class reversingString {
    public static void main(String args[]){
        System.out.println(reverse("hello"));
    }

    public static String reverse(String str){
        StringBuilder reversed = new StringBuilder(str);

        return reversed.reverse().toString();
    }
}
