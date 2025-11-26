
public class PaypalPayment implements PaymentStrategy {
    
    private String email;

    public PaypalPayment(String email) {
        this.email = email;
    }
    
    public void pay(double amount){
        System.out.println(amount + " paid using paypal");
    }

}
