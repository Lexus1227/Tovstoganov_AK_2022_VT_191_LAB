package bank.entity;

public class BankOffice {

    private long id;
    private String name;
    private String address;
    private boolean status;
    private boolean atmCanBePlaced;
    private int numberOfAtms;
    private int creditCanBeIssued;
    private boolean isPaymentingMoney;
    private boolean isDepositingMoney;
    private Currency numberOfMoney;
    private Currency rentPrice;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isAtmCanBePlaced() {
        return atmCanBePlaced;
    }

    public void setAtmCanBePlaced(boolean atmCanBePlaced) {
        this.atmCanBePlaced = atmCanBePlaced;
    }

    public int getNumberOfAtms() {
        return numberOfAtms;
    }

    public void setNumberOfAtms(int numberOfAtms) {
        this.numberOfAtms = numberOfAtms;
    }

    public int getCreditCanBeIssued() {
        return creditCanBeIssued;
    }

    public void setCreditCanBeIssued(int creditCanBeIssued) {
        this.creditCanBeIssued = creditCanBeIssued;
    }

    public boolean isPaymentingMoney() {
        return isPaymentingMoney;
    }

    public void setPaymentingMoney(boolean paymentingMoney) {
        this.isPaymentingMoney = paymentingMoney;
    }

    public boolean isDepositingMoney() {
        return isDepositingMoney;
    }

    public void setDepositingMoney(boolean depositingMoney) {
        this.isDepositingMoney = depositingMoney;
    }

    public Currency getNumberOfMoney() {
        return numberOfMoney;
    }

    public void setNumberOfMoney(Currency numberOfMoney) {
        this.numberOfMoney = numberOfMoney;
    }

    public Currency getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(Currency rentPrice) {
        this.rentPrice = rentPrice;
    }
}
