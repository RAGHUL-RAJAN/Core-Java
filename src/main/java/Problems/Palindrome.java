package Problems;

public class Palindrome {

    public static void main(String[] args) {
        String st = "MALAYALAM", rev = "";
        String original = st;

        for(int i = st.length()-1; i>=0 ; i--){
            rev = rev + st.charAt(i);
        }

        if(rev.equals(original)){
            System.out.println("Given string is palindrome");
        }else{
            System.out.println("Given string is not palindrome");
        }
    }
}
