package Collection;
import java.util.ArrayList;
public class ArList {
    public static void main(String[] args) {
        ArrayList<String> st = new ArrayList<>();
        st.add("Jack");
        st.add("car");
        System.out.println(st);
        System.out.println(st.get(1));
    }
}
/*
    wait<WebDriver> fluentWait = new FluentWait<>(driver)
        .withTimeout(Duration.ofSeconds(30));
        .pollingEvery(Duration.ofSeconds(5));
        .ignore(NoSuchElementException.class);
 */