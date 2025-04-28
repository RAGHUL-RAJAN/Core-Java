package Collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<String> st = new HashSet<String>();
        st.add("mango");
        st.add("apple");
        st.add("banana");

        System.out.println(st);
    }
}
