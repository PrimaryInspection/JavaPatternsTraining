package patterns.chainOfResponsibilityPayment;

public abstract class HandlingModule {
    int priority;

    public HandlingModule next;
    public HandlingModule(int priority){this.priority = priority;}

    public void paymentHandler(Payment payment, String message, int level){
        if(level <= priority){
            write(payment,message);
        }
        if(next!=null){
            next.paymentHandler(payment,message,level);
        }
    }

    void setNextPaymentHandler(HandlingModule handlingModule){
        this.next=handlingModule;
    }

    abstract void write(Payment payment, String message);
}
