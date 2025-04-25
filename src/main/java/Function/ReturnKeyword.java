package Function;

public class ReturnKeyword {
    int sum(int num){
        int soap_price = 20;
        int rem =num - soap_price;

        return rem;
    }

    public static void main(String[] args) {
        ReturnKeyword re = new ReturnKeyword();
       int balance =  re.sum(23);
        System.out.println(balance);
    }
}
