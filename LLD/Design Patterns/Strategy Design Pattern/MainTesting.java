
public class MainTesting {
    public static void main(String[] args) {

        /*Strategy Pattern decides behavior at runtime
         factory design returns an object but here we can decide what behaviour to use.
         creates an reference to interface and implemented in differnt classes
         then used a contextclass which decides which strategy to use given by user at run time.
        */
        
        ContextClass ctx=new ContextClass();

        ctx.setPaymentStrategy(new UpiPayment("rushikesh@ybl"));
        ctx.checkout(100);

        ctx.setPaymentStrategy(new CreditCardPayment("1232"));
        ctx.checkout(1000);

        ctx.setPaymentStrategy(new PaypalPayment("kanapuramrushi@gmail.com"));
        ctx.checkout(125);


    }
}
