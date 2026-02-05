package com.crisfloretino.arbitrage.util;

import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Component
public final class Dates {
    private static final ZoneId ZONE = ZoneId.of("UTC");
    private static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("MMM dd, h:mm a z");

    private Dates() {}

    public static String todayStart() {
        return LocalDate.now(ZONE)
                .atStartOfDay(ZONE)
                .format(DateTimeFormatter.ISO_INSTANT);
    }

    public static String todayEnd() {
        return LocalDate.now(ZONE)
                .plusDays(1)
                .atStartOfDay(ZONE)
                .minusSeconds(1)
                .format(DateTimeFormatter.ISO_INSTANT);
    }

    public static String format(String isoDateString) {
        if (isoDateString == null || isoDateString.isEmpty()) { return "N/A"; }

        try {
            Instant utcTime = Instant.parse(isoDateString);
            ZonedDateTime localTime = utcTime.atZone(ZONE);

            return localTime.format(FORMAT);
        } catch (Exception e) {
            return isoDateString;
        }
    }
}