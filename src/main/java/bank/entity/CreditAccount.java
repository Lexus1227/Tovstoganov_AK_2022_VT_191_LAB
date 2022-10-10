package bank.entity;

import java.util.Date;

public class CreditAccount {

    private long id;
    private User user;
    private String bankName;
    private Date creditStart;
    private Date creditEnd;
    private int numberOfMonths;
    private Currency amountOfMoney;
    private Currency monthlyPayment;
    private int interestRate;
    private Employee creditEmployee;
    private PaymentAccount paymentAccount;

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

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Date getCreditStart() {
        return creditStart;
    }

    public void setCreditStart(Date creditStart) {
        this.creditStart = creditStart;
    }

    public Date getCreditEnd() {
        return creditEnd;
    }

    public void setCreditEnd(Date creditEnd) {
        this.creditEnd = creditEnd;
    }

    public int getNumberOfMonths() {
        return numberOfMonths;
    }

    public void setNumberOfMonths(int numberOfMonths) {
        this.numberOfMonths = numberOfMonths;
    }

    public Currency getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(Currency amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public Currency getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(Currency monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public Employee getCreditEmployee() {
        return creditEmployee;
    }

    public void setCreditEmployee(Employee creditEmployee) {
        this.creditEmployee = creditEmployee;
    }

    public PaymentAccount getPaymentAccount() {
        return paymentAccount;
    }

    public void setPaymentAccount(PaymentAccount paymentAccount) {
        this.paymentAccount = paymentAccount;
    }
}
