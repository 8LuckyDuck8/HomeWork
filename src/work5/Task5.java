package work5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество рублей: ");
        int a = in.nextInt();
        int b = a;
        if (a % 10 == 1) {
            if (a % 100 == 11)
                System.out.println(a + " рублей");
            else
                System.out.println(a + " рубль");
        } else {
            b = b % 10;
            if (b >= 2 & b <= 4) {
                System.out.println(a + " рубля");
            } else if (b > 4) {
                System.out.println(a + " рублей");
            }
        }
    }

}

