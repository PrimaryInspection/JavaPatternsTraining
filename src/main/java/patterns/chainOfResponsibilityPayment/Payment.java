package patterns.chainOfResponsibilityPayment;

public class Payment {
    boolean isCreated;
    boolean isValid;
    double bankPercent;
    double balance;

    public Payment(double balance, boolean isCreated, boolean isValid, double bankPercent) {
        this.isCreated = isCreated;
        this.isValid = isValid;
        this.bankPercent = bankPercent;
        this.balance = balance;

    }

    double calculateBankPercent(){
        double percent;
        percent = (balance * bankPercent) / 100;
        balance -= percent;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCreated(boolean created) {
        isCreated = created;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public void setBankPercent(double bankPercent) {
        this.bankPercent = bankPercent;

    }

    public boolean isCreated() {
        return isCreated;
    }

    public boolean isValid() {
        return isValid;
    }

    public double getBankPercent() {
        return bankPercent;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "isCreated=" + isCreated +
                ", isValid=" + isValid +
                ", bankPercent=" + bankPercent +
                ", balance=" + balance +
                '}';
    }


}
