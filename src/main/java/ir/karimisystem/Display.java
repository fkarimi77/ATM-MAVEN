package ir.karimisystem;

import java.math.BigDecimal;
import java.util.Scanner;

public class Display {

    public void showMenu() {

        AccountController obj= new AccountController();
        Scanner ch = new Scanner(System.in);




        while (true){
            System.out.println("Please Choose Your Action...");
            System.out.println("--1) Show the account Balance");
            System.out.println("--2) Transfer money");
            System.out.println("--3) Creat and open a new account");
            System.out.println("--4) Back To Menu");
            System.out.println("--5) Exit");
            int choice = ch.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Enter the account number :");
                    int num= ch.nextInt();
                    BigDecimal balance = obj.showBalance(String.valueOf(num));
                    System.out.println(String.format("The balance is %s",balance.toString()));
                    break;

                case 2:
                    System.out.println("Enter origin Account number :");
                    String or=ch.next();
                    System.out.println("Enter deestination Account number :");
                    String des=ch.next();
                    System.out.println("Enter amount money :");
                    BigDecimal money=ch.nextBigDecimal();
                    obj.transfer(String.valueOf(or),String.valueOf(des),money);



                    break;

                case 3:
                    System.out.println("Enter Your name :");
                    String nName= ch.next();
                    String cn="Karimi";
                    obj.createNewAccount(cn);
                    break;

                case 4:
                    showMenu();
                    break;

                    case 5:
                    System.out.println("See you Soon...");
                    break;
            }
        }



    }

}





