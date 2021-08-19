package com.pleaserefresh;

public class Main extends Calculate {
    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;

    public static void main(String[] args) {
        int principal = (int) readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) readNumber("Period (Years): ", 1, 30);

        printMortgage(principal, annualInterest, years);
        printPaymentSchedule(principal, annualInterest, years);
    }

    public static byte getMonthsInYear() {
        return MONTHS_IN_YEAR;
    }

    public static byte getPERCENT() {
        return PERCENT;
    }
}
