package Collections;

import java.util.Collections;
import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<String> lt = new LinkedList<String>();
        lt.add("Jack");
        lt.addLast(" raghul");
        lt.addFirst("Sparrow");

        System.out.println(lt);

        Collections.sort(lt);
        System.out.println(lt);

        Collections.sort(lt, Collections.reverseOrder());
        System.out.println(lt);
//        lt.clear();
//        System.out.println(lt);
    }
}
