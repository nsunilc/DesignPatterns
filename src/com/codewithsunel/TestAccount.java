package com.codewithsunel;

public class TestAccount {


    public static void main(String[] args) {
        // write your code here
        Account account = new Account();
        account.deposit(25);
        account.withdraw(5);

        System.out.println(account.getBalance());
    }
}
