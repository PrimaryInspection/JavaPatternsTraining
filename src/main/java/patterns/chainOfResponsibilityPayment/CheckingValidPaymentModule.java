package patterns.chainOfResponsibilityPayment;

public class CheckingValidPaymentModule extends HandlingModule {

    public CheckingValidPaymentModule(int priority) {
        super(priority);
    }

    @Override
    void write(Payment payment, String message) {
        if (!payment.isValid() && payment.isCreated){
            payment.setValid(true);
            System.out.println("Проверка на валидностсь прошла успешно " + message);
        }else throw new RuntimeException("Ошибка при создании или валидации платежа!");
    }
}
