package ATM;

public class login {
    private String userCard = "1234567890";
    private String userPin = "12345";

    public boolean credentials(String card, String pin) {
        return card.equals(userCard) && pin.equals(userPin);
    }
}
