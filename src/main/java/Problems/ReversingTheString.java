package Problems;

public class ReversingTheString {
    public static void main(String[] args) {


        String sentence = "I Love Programming";
        String[] words = sentence.split(" ");
        String lastword = words[words.length - 1];

        String reversed = " ";

        for (int i = lastword.length() - 1; i >= 0; i--) {
            reversed = reversed + lastword.charAt(i);
        }

        words[words.length-1] = reversed;

        String result =" ";
        for( String word : words ){
            result = result + word + " ";
        }

        System.out.println(result.trim());
    }
}
