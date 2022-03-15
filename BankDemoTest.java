package com.company;
import java.util.Scanner;
public class BankDemoTest{

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        CheckingAccount cust = new CheckingAccount(1);
        System.out.print("Enter amount to deposit: $");
        double depositAmt = scan.nextDouble();
        cust.deposit(depositAmt);

        try {
            System.out.print("Enter amount to withdraw: $");
            double withdrawAmt = scan.nextDouble();
            cust.withdraw(withdrawAmt);
            System.out.printf("The balance after withdraw is: $%.2f",cust.getbalance());
        } catch (MyException e) {
            //TODO: handle exception
        }
        scan.close();
    }
}