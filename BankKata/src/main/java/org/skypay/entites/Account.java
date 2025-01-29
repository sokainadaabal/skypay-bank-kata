package org.skypay.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



@AllArgsConstructor
@Getter
public class Account {
    private int balance;
    private final List<Transaction> transactions = new ArrayList<>();

    public Account() {
        this.balance = 0;
    }

    public void addTransaction(int amount) {
        transactions.add(new Transaction(amount, Transaction.formattedDate(), getBalance()));
    }

    // Encapsulation
    public List<Transaction> getTransactions() {
        return Collections.unmodifiableList(transactions);
    }

    public void updateBalance(int amount) {
        balance += amount;
    }
}
