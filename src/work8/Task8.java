package work8;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int sum = 1 ;
        int m = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, факториал которого нужно посчитать [1] - [30]:");
        int i = in.nextInt();
        while(true){
            if(i < 1 || i > 30){
                System.out.println("Введите число, факториал которого нужно посчитать [1] - [30], большее число нельзя вычислить:");
                i = in.nextInt();
            }else break;
        }
        while ( m <= i){
            sum *=  m ;
            m++;
        }
        System.out.println(sum);
    }
}
