package work12;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int k = in.nextInt();
        int m = 0;
        m = k;
        String g  = "";
        while(m != 0){
            m = k % 1000;
            k /= 1000;
            if(m != 0 ) {
                g = " " + m + g;
            }
        }
        System.out.println(g);
    }
}
