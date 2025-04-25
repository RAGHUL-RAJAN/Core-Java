package Function;

public class Addition {

    int a = 2, b = 3;

    void sum(){
        System.out.println(a+b);
    }

    void multiple(){
        System.out.println(a*b);
    }

    public static void main(String[] args) {

        Addition ad = new Addition();
        ad.sum();

        ad.multiple();

    }
}
