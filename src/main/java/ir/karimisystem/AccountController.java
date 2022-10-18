package ir.karimisystem;

import java.math.BigDecimal;
import java.util.*;

public class AccountController {

    List<Account> accounts=new ArrayList<>();


    public BigDecimal showBalance(String accountnumber){
        for (Account account:accounts){
            if (account.getAccountnumber().equals(accountnumber)){
                return account.getBalance();
            }

        }
       return null ;
    }



    public void transfer(String sourceAccountNumber,String destinationAccountNumber,BigDecimal amount){
        String sourceAccount = null;
        String destinationAccount= null;
        BigDecimal transferAmount=null;
        for(Account account:accounts){
            if (account.getAccountnumber().equals(sourceAccountNumber)){
                sourceAccount=sourceAccountNumber;
            }
             if(account.getAccountnumber().equals(destinationAccountNumber)) {
                destinationAccount=sourceAccountNumber;

            }

             if(account.getBalance().equals(amount)){
                transferAmount=amount;

            }
            else{
                throw new RuntimeException("You dont have enough money..!");
            }
        }


    }





    public void createNewAccount(String accountNumber){
        Account acobj=new Account();
        accounts.add(acobj);
        acobj.setBalance(BigDecimal.ZERO);

    }


}

