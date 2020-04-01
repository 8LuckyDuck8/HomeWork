package work2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int s = in.nextInt();
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
