package org.skypay.entites;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
public class StatementPrinter {
    public String print(List<Transaction> transactions) {
        StringBuilder statement = new StringBuilder("Date || Amount || Balance\n");

        List<Transaction> transactionsCopy = new ArrayList<>(transactions);
        Collections.reverse(transactionsCopy);

        for (Transaction transaction : transactionsCopy) {
            statement.append(transaction.getDate()).append(" || ")
                    .append(transaction.getAmount()).append(" || ")
                    .append(transaction.getBalance()).append("\n");
        }

        return statement.toString();
    }
}
