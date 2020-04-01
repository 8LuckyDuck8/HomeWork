package work3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.print("Введите число: ");
        int s = in.nextInt();
        int b = 0;
        if(s < 0){
            b = s * (-1);
        }
        if ( b % 10 == 7)
            System.out.println("Последняя цифра числа является семеркой");
         else
            System.out.println("Последняя цифра числа не является семеркой");


    }

}
