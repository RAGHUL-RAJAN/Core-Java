package Collections;


import java.util.ArrayList;

public class ArrayList01{

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Car");
        arr.add("Bike");
        arr.add("Bus");
        arr.add("Flight");

        System.out.println(arr.size());

//        arr.remove(1);

        System.out.println(arr.get(2));


    }
}
