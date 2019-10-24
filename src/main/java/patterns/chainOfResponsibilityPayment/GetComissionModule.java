package patterns.chainOfResponsibilityPayment;

public class GetComissionModule extends HandlingModule{


    public GetComissionModule(int priority) {
        super(priority);
    }

    @Override
    void write(Payment payment, String message) {
        if(payment.getBalance() > 0 && payment.isCreated() && payment.isValid()){
            payment.calculateBankPercent();
            System.out.println("Все операции прошли успешно " + message + ", Ваш баланс: " + payment.getBalance());
        }else throw new RuntimeException("Недостаточно денег на счету, или ошибка валидации платежа!");
    }
}
