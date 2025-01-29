package org.skypay.services;

import org.junit.jupiter.api.Test;
import org.skypay.entites.Account;
import org.skypay.entites.StatementPrinter;

import static org.junit.jupiter.api.Assertions.*;

class AccountServiceImplTest {
    @Test
    void shouldUpdateBalanceAfterDepositAndWithdrawal() {
        Account account = new Account();
        StatementPrinter statementPrinter = new StatementPrinter();
        AccountService accountService= new AccountServiceImpl(account,statementPrinter);
        accountService.deposit(1000);
        assertEquals(1000,account.getBalance());
        accountService.withdraw(500);
        assertEquals(500,account.getBalance());
    }
    @Test
    void shouldThrowExceptionForNegativeDeposit() {
        Account account = new Account();
        StatementPrinter statementPrinter = new StatementPrinter();
        AccountService accountService= new AccountServiceImpl(account,statementPrinter);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> accountService.deposit(-100));
        assertEquals("The amount requested must be positive.", exception.getMessage());
    }

    @Test
    void shouldThrowExceptionForNegativeWithdrawal() {
        Account account = new Account();
        StatementPrinter statementPrinter = new StatementPrinter();
        AccountService accountService= new AccountServiceImpl(account,statementPrinter);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> accountService.withdraw(-50));
        assertEquals("The amount requested must be positive.", exception.getMessage());
    }

    @Test
    void shouldThrowExceptionForInsufficientBalance() {
        Account account = new Account();
        StatementPrinter statementPrinter = new StatementPrinter();
        AccountService accountService= new AccountServiceImpl(account,statementPrinter);
        accountService.deposit(100);

        Exception exception = assertThrows(IllegalStateException.class, () -> accountService.withdraw(200));
        assertEquals("This account does not have a sufficient balance.", exception.getMessage());
    }

}