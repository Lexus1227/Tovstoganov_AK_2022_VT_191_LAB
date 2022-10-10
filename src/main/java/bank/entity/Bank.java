package bank.entity;

public class Bank {

    private long id;
    private String name;
    private int numberOfOffices;
    private int numberOfAtms;
    private int numberOfEmployees;
    private int numberOfClients;
    private int bankRating;
    private Currency amountOfMoney;
    private int interestRate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfOffices() {
        return numberOfOffices;
    }

    public void setNumberOfOffices(int numberOfOffices) {
        this.numberOfOffices = numberOfOffices;
    }

    public int getNumberOfAtms() {
        return numberOfAtms;
    }

    public void setNumberOfAtms(int numberOfAtms) {
        this.numberOfAtms = numberOfAtms;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfClients() {
        return numberOfClients;
    }

    public void setNumberOfClients(int numberOfClients) {
        this.numberOfClients = numberOfClients;
    }

    public int getBankRating() {
        return bankRating;
    }

    public void setBankRating(int bankRating) {
        this.bankRating = bankRating;
    }

    public Currency getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(Currency amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }
}
