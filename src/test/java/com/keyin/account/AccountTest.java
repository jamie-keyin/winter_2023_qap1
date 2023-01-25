package com.keyin.account;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    public void testTransfer() {
        Account accountToDebit = new Account(1,"accountToDebit", 200.00);
        Account accountToCredit = new Account(2,"accountToCredit", 0.00);

        accountToDebit.transfer(accountToCredit, 100.00);

        Assertions.assertTrue(accountToCredit.getBalance() == 100.00);

        System.out.println("Account 1 balance: " + accountToDebit.getBalance());
        System.out.println("Account 2 balance: " + accountToCredit.getBalance());
    }

    @Test
    public void testTransferLowBalance() {
        Account accountToDebit = new Account(1,"accountToDebit", 50.00);
        Account accountToCredit = new Account(2,"accountToCredit", 0.00);

        accountToDebit.transfer(accountToCredit, 100.00);

        Assertions.assertFalse(accountToCredit.getBalance() == 100.00);

        System.out.println("Account 1 balance: " + accountToDebit.getBalance());
        System.out.println("Account 2 balance: " + accountToCredit.getBalance());
    }

    @Test
    public void testTransferAsInQAP() {
        Account accountToDebit = new Account(1,"accountToDebit", 5000.00);
        Account accountToCredit = new Account(2,"accountToCredit", 4000.00);

        accountToDebit.transfer(accountToCredit, 1000.00);

        Assertions.assertTrue(accountToCredit.getBalance() == 5000.00);

        System.out.println("Account 1 balance: " + accountToDebit.getBalance());
        System.out.println("Account 2 balance: " + accountToCredit.getBalance());
    }

}
