package org.skypay.services;

import org.skypay.entites.Account;
import org.skypay.entites.StatementPrinter;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class AccountAcceptanceMockistTest {

    @Test
    public void testStatementPrinter() {
        StatementPrinter mockPrinter = mock(StatementPrinter.class);

        Account account = new Account();

        AccountServiceImpl accountService = new AccountServiceImpl(account, mockPrinter);

        accountService.deposit(1000);
        accountService.deposit(2000);
        accountService.withdraw(500);

        accountService.printStatement();

        verify(mockPrinter).print(anyList());
    }
}
