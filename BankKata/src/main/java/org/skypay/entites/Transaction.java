package org.skypay.entites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
@NoArgsConstructor

public class Transaction {
    private String date;
    private int amount;
    private int balance;

    public Transaction(int amount, String date, int balance){
        this.amount= amount;
        this.balance=balance;
        this.date=date;
    }

    public  static String formattedDate(){
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return today.format(formatter);
    }

    @Override
    public String toString() {
        return String.format("%s || %d || %d", date, amount, balance);
    }
}
