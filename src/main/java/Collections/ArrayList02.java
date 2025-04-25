package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList02 {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("rahul");
        arr.add("Jack");
        arr.add(2,"vicky");
        arr.add(3,"harish");

        System.out.println(arr.size());
        System.out.println(arr);
        System.out.println(arr.get(2));
        System.out.println(arr.set(1,"sparrow"));
        System.out.println(arr);
//        System.out.println();
        Collections.sort(arr);
        System.out.println(arr);

    }
}
