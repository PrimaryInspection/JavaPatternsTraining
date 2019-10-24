package patterns.chainOfResponsibilityPayment;

public class Application {
    public static void main(String[] args) {
        HandlingModule module0 = new CreatingPaymentModule(Priotity.FIRST_PRIORITY);
        HandlingModule module1 = new CheckingValidPaymentModule(Priotity.SECOND_PRIORITY);
        HandlingModule module2 = new GetComissionModule(Priotity.THIRD_PRIORITY);

        module0.setNextPaymentHandler(module1);
        module1.setNextPaymentHandler(module2);

        module0.paymentHandler(new Payment(100,false,false,10),"Test",1);
    }
}
