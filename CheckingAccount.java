package com.company;
public class CheckingAccount{
    private int accNum;
    private double bal;

    public CheckingAccount(int accNum)
    {
        this.accNum = accNum;
        this.bal = 0;
    }

    public CheckingAccount(int accNum, double bal)
    {
        this.accNum = accNum;
        this.bal = bal;
    }
    public void deposit(double amt)
    {
        this.bal += amt;
    }

    public void withdraw(double amt) throws MyException
    {
        if(this.bal < amt)
        {
            throw new MyException(amt-this.bal);
        }
        this.bal -= amt;
    }

    public double getbalance()
    {
        return this.bal;
    }

    public int getNumber()
    {
        return this.accNum;
    }
}
