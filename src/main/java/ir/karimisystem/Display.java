package ir.karimisystem;

import java.math.BigDecimal;
import java.util.Scanner;

public class Display {

    public void showMenu() {
        Scanner ch = new Scanner(System.in);
        int choice = ch.nextInt();
        AccountController obj= new AccountController();


        do {
            System.out.println("Please Choose Your Action...");
            System.out.println("--1) visit your Balance--");
            System.out.println("--2) Transfer--");
            System.out.println("--3) Open New ir.karimisystem.Account--");
            System.out.println("--4) Back To Menu--");
            System.out.println("--5) Exit--");


            switch (choice) {
                case 1:
                    System.out.println("Enter the ir.karimisystem.Account Number :");
                    int num= ch.nextInt();
                    String acc="123456";
                    obj.showBalance(acc);
                    break;
                case 2:

                    System.out.println("Enter origin ir.karimisystem.Account number :");
                    String origin= ch.next();
                    String or="12345";
                    System.out.println("Enter Destenation ir.karimisystem.Account number :");
                    String des= ch.next();
                    String dest="4567";
                    System.out.println("Enter the Amount :");
                    BigDecimal amount= ch.nextBigDecimal();
                    break;
                case 3:
                    String cn="Karimi";
                    obj.createNewAccount(cn);
                case 4:
                    showMenu();
                    break;
                case 5:
                    System.out.println("See you Soon...");
                    break;
            }
        }

        while (choice != 6);

    }

}





