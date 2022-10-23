package ir.karimisystem;

import java.math.BigDecimal;

public class Account {

    String accountNumber;
    BigDecimal balance;
    String ownerName;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountnumber) {

        this.accountNumber = accountnumber;

    }

    public  BigDecimal getBalance() {
        return  balance;
    }

    public void setBalance(BigDecimal balance) {
        
        this.balance = balance;
    }
}
