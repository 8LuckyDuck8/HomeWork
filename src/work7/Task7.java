package work7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите рзамеры участка: ");
        int e = in.nextInt();
        int f = in.nextInt();
        System.out.println("Введите размеры первого дома: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Введите размеры второго дома: ");
        int c = in.nextInt();
        int d = in.nextInt();
        int max_house = 0;
        int max_place = 0;

        if ((a * b + c * d) < (e * f)) {
            if ((a + d) < e & (b + c) < f || (a + c) < e & (b + d) < f){
                System.out.println("Поместиться");
            }else {
                if((a + d) < f & (b + c) < e || (a + c) < f & (b + d) < e){
                    System.out.println("Поместиться");
                }else {
                    System.out.println("Не поместиться");
                }
            }
        }else {
            System.out.println("Не поместиться");
        }
    }
}
