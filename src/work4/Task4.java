package work4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Введите перую сторону: ");
        int a = in.nextInt();

        System.out.println("Введите вторую сторону: ");
        int b = in.nextInt();

        System.out.println("Введите радиус окружности: ");
        int r = in.nextInt();

        if(((r*2)*(r*2)) >= (a*a + b*b))
            System.out.println("Окружности заданного радиуса хватит , чтобы закрыть отверстие ");
         else
            System.out.println("Окружности заданного радиуса не хватит , чтобы закрыть отверстие ");
    }



}
