package com.intellif.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TestDemo {
    public static void main(String[] args) {
        LocalDate localDateWu = LocalDate.of(2020,10,29);
        LocalDate localDateLiu = LocalDate.of(2020,1,15);
        LocalDate localDateStart =  LocalDate.of(2020,1,1);
        long untilLiu = localDateStart.until(localDateLiu, ChronoUnit.DAYS)+1;
        System.out.println("untilLiu:"+untilLiu);
        long untilLiuWu = localDateLiu.until(localDateWu, ChronoUnit.DAYS)+1;
        System.out.println("untilLiuWu:"+untilLiuWu);
        long middleUntil = untilLiuWu / 2 + untilLiu;
        System.out.println("middleUntil:"+middleUntil);
        LocalDate localDate = localDateStart.plusDays(middleUntil-1);
        System.out.println(localDate);
    }
}
