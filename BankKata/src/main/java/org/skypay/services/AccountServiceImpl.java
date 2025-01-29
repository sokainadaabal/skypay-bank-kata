package org.skypay.services;


import org.skypay.entites.Account;
import org.skypay.entites.StatementPrinter;

public class AccountServiceImpl implements AccountService{
    private final Account account;
    private final StatementPrinter statementPrinter;

    private static final String ERROR_NEGATIVE_AMOUNT = "The amount requested must be positive.";
    private static final String ERROR_INSUFFICIENT_BALANCE = "This account does not have a sufficient balance.";

    public AccountServiceImpl(Account account, StatementPrinter statementPrinter) {

        this.account = account;
        this.statementPrinter = statementPrinter;
    }
    @Override
    public void deposit(int amount) {
        validateAmount(amount);
        account.updateBalance(amount);
        account.addTransaction(amount);
    }

    @Override
    public void withdraw(int amount) {
        validateAmount(amount);
        validateBalance(account.getBalance(), amount);
        account.updateBalance(-amount);
        account.addTransaction(-amount);
    }

    @Override
    public void printStatement() {
        String statement = statementPrinter.print(account.getTransactions());
        System.out.println(statement);
    }



    private void validateAmount(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(ERROR_NEGATIVE_AMOUNT);
        }
    }

    private void validateBalance(int balance, int amount)
    {
        if(balance<amount){
            throw  new IllegalStateException(ERROR_INSUFFICIENT_BALANCE);
        }
    }

}

