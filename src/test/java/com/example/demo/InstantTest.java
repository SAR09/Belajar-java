package com.example.demo;

import org.junit.jupiter.api.Test;

import java.time.*;

public class InstantTest {

    @Test
    void create() {

        Instant instant1 = Instant.now();
        System.out.println(instant1);

        Instant instant2 = Instant.ofEpochMilli(0);
        System.out.println(instant2);
    }

    @Test
    void modify() {
        Instant instant1 = Instant.now();
        Instant instant2 = instant1.plusMillis(1000);
        Instant instant3 = instant1.minusMillis(1000);

        System.out.println(instant1);
        System.out.println(instant2);
        System.out.println(instant3);
    }

    @Test
    void get() {

        Instant instant = Instant.now();

        System.out.println(instant.toEpochMilli());
        System.out.println(instant.getEpochSecond());
    }

    @Test
    void fromInstant() {

        Instant instant = Instant.now();

        ZoneId zoneId = ZoneId.of("Asia/Jakarta");

        LocalTime localTime = LocalTime.ofInstant(instant, zoneId);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zoneId);
        System.out.println(localDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, zoneId);
        System.out.println(zonedDateTime);

        OffsetDateTime offsetDateTime = OffsetDateTime.ofInstant(instant, zoneId);
        System.out.println(offsetDateTime);
    }

    @Test
    void toInstant() {
        Instant instant = LocalDateTime.now().toInstant(ZoneOffset.ofHours(7));
        System.out.println(instant);

        Instant instant2 = ZonedDateTime.now().toInstant();
        System.out.println(instant2);


    }
}

