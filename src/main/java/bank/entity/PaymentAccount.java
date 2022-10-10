package bank.entity;

public class PaymentAccount {

    private long id;
    private User user;
    private Bank bankName;
    private Currency amountOfMoney;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Bank getBankName() {
        return bankName;
    }

    public void setBankName(Bank bankName) {
        this.bankName = bankName;
    }

    public Currency getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(Currency amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
}
