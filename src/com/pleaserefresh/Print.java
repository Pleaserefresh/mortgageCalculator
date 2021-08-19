package com.pleaserefresh;

import java.text.NumberFormat;

public class Print {
    protected static void printMortgage(int principal, float annualInterest, byte years) {
        double mortgage = com.pleaserefresh.Main.calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    protected static void printPaymentSchedule(int principal, float annualInterest, byte years) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= years * com.pleaserefresh.Main.getMonthsInYear(); month++) {
            double balance = com.pleaserefresh.Main.calculateBalance(principal, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}
