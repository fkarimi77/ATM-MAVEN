package ir.karimisystem;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class AccountController {

    List<Account> accounts=new ArrayList<>();


    public BigDecimal showBalance(String accountnumber){
        for (Account account:accounts){
            if (account.getAccountNumber().equals(accountnumber)){
                return account.getBalance();
            }

        }
       return null ;
    }



    public void transfer(String sourceAccountNumber,String destinationNumber,BigDecimal amount){
        Account sourceAccount=null;
        Account destinationAccount=null;
        BigDecimal transferAmount=null;
        for (Account account:accounts){
            if (account.getAccountNumber().equals(sourceAccountNumber)){
                sourceAccount=account;
            }
            if (account.getAccountNumber().equals(destinationNumber)){
                destinationAccount=account;
            }
            else if (sourceAccount.getBalance().compareTo(amount) !=1){
                throw new RuntimeException("you dont have enough money....");

            }
        }

    }





    public void createNewAccount(String accountNumber){
        Account acobj = new Account();
        acobj.setBalance(BigDecimal.ZERO);
        int randomNum = ThreadLocalRandom.current().nextInt(3300011, 240000044 + 1);
        acobj.setAccountNumber(String.valueOf(randomNum));
        accounts.add(acobj);
        System.out.println(String.format("Account %s was created ", acobj.getAccountNumber()));
    }


}

