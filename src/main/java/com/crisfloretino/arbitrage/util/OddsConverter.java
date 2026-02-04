package com.crisfloretino.arbitrage.util;

public class OddsConverter {
    private OddsConverter() {}

    public static double toDecimal(String amOdds) {
        if (amOdds == null || amOdds.isBlank()) {
            throw new IllegalArgumentException("Odds strings cannot be null or empty");
        }

        double american = Double.parseDouble(amOdds.trim());

        if (american > 0) {
            return (american / 100.0) + 1.0;
        } else {  return (100.0 / Math.abs(american)) + 1.0; }
    }
}