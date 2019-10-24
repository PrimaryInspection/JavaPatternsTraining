package patterns.chainOfResponsibilityPayment;

public class CreatingPaymentModule extends HandlingModule {

  public CreatingPaymentModule(int priority){
      super(priority);
  }

    @Override
    void write(Payment payment, String message) {
        if(!payment.isCreated()){
            payment.setCreated(true);
            System.out.println("Заявка на платеж создана " + message);
        }
    }


}
