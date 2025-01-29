package org.skypay.entites;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StatementPrinterTest {
    @Test
    void shouldReturnFormattedStatementWithReversedTransactions() {
        StatementPrinter printer = new StatementPrinter();

        List<Transaction> transactions = Arrays.asList(
                new Transaction(1000, "10/01/2012", 1000),
                new Transaction(2000, "13/01/2012", 3000),
                new Transaction(-500, "14/01/2012", 2500)
        );

        String actualStatement = printer.print(transactions);

        String expectedStatement =
                """
                        Date || Amount || Balance
                        14/01/2012 || -500 || 2500
                        13/01/2012 || 2000 || 3000
                        10/01/2012 || 1000 || 1000
                        """;

        assertEquals(expectedStatement, actualStatement);
    }
}