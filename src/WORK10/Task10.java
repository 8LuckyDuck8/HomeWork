package WORK10;

public class Task10 {
    public static void main(String[] args) {
        int a = 0 ;
        int sum = 0;
        int b = 0;
        int x = (int)(Math.random() * 1000);
        a = x;
        do{
            b = x % 10;
            x /= 10;
            sum += b;
        }while(x != 0);
        System.out.println("Сумма цифр числа " + a + " равна: " + sum);
    }
}
