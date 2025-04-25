package Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class date {
    public static void main(String[] args) {
        LocalDate obj = LocalDate.now();
        LocalTime obj2 = LocalTime.now();
        LocalDateTime obj3 = LocalDateTime.now();

        /*
        DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");   =>  Fri, Apr 25 2025 15:05:45

        DateTimeFormatter.ofPattern("dd-mm-yyyy HH:MM:SS");   =>  25-07-2025 15:04:37
         */


        DateTimeFormatter obj4 = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:MM:SS");   // 25-07-2025 15:04:37

        String formatedDate = obj4.format(obj3);

        System.out.println(obj);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println("************");
        System.out.println(formatedDate);
    }
}
