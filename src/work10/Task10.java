package work10;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int a = 0 ;
        int sum = 0;
        int b = 0;
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        a = x;
        do{
            b = x % 10;
            x /= 10;
            sum += b;
        }while(x != 0);
        System.out.println("Сумма цифр числа " + a + " равна: " + sum);
    }
}
