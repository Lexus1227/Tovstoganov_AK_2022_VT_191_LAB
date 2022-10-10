package bank.entity;

import java.util.Date;

public class Employee {

    private long id;
    private String fullName;
    private Date birthDate;
    private String position;
    private Bank bank;
    private boolean workingInOffice;
    private BankOffice bankOffice;
    private int creditCanBeIssued;
    private Currency salary;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public boolean isWorkingInOffice() {
        return workingInOffice;
    }

    public void setWorkingInOffice(boolean workingInOffice) {
        this.workingInOffice = workingInOffice;
    }

    public BankOffice getBankOffice() {
        return bankOffice;
    }

    public void setBankOffice(BankOffice bankOffice) {
        this.bankOffice = bankOffice;
    }

    public int getCreditCanBeIssued() {
        return creditCanBeIssued;
    }

    public void setCreditCanBeIssued(int creditCanBeIssued) {
        this.creditCanBeIssued = creditCanBeIssued;
    }

    public Currency getSalary() {
        return salary;
    }

    public void setSalary(Currency salary) {
        this.salary = salary;
    }
}
