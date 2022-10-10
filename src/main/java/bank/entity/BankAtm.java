package bank.entity;

public class BankAtm {
    private long id;
    private String name;
    private String address;
    private BankAtmStatus status;
    private Bank bank;
    private Employee serviceEmployee;
    private boolean isPaymentingMoney;
    private boolean isDepositingMoney;
    private Currency numberOfMoney;
    private Currency maintenancePrice;

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

    public BankAtmStatus getStatus() {
        return status;
    }

    public void setStatus(BankAtmStatus status) {
        this.status = status;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Employee getServiceEmployee() {
        return serviceEmployee;
    }

    public void setServiceEmployee(Employee serviceEmployee) {
        this.serviceEmployee = serviceEmployee;
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

    public Currency getMaintenancePrice() {
        return maintenancePrice;
    }

    public void setMaintenancePrice(Currency maintenancePrice) {
        this.maintenancePrice = maintenancePrice;
    }
}


