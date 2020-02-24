package com.WORK2;

public class Task2 {
    public static void main(String[] args) {
        int s = 800000;
        int sec ;
        int m;
        int min , h , hours, d , days , week;
        sec = s % 60;
        m = (s- sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        hours = h % 24;
        d = h / 24;
        week = h / 24  / 7;
        days =  d - 7 * week;



        System.out.println(week + " недель " + days + " дней " + hours + " часов " + min + " минут " + sec + " секунд" );
    }
}
