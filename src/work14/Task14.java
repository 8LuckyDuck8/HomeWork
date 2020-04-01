package work14;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int marks[] = new int [20];
        for(int i = 0 ; i < 20 ;i++){
            System.out.print("Введите mark[" + i + "] :" );
            marks[i] = in.nextInt();
        }
        System.out.println();
        int maxMark = marks[0];
        int k = 0;
        for(int i = 0 ; i < marks.length ; i++ ){
            if(maxMark < marks[i]) {
                maxMark = marks[i];
                k = i;
            }
        }
        System.out.println("Номер максимальной оценки : " + k);
    }
}
