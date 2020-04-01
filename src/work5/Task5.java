package work5;

public class Task5 {
    public static void main(String[] args) {
        int a = 1913;
        if (a  % 10 ==1){
            if (a % 100 == 11)
                System.out.println( a + " рублей");
            else
                System.out.println( a + " рубль");
        } else if(a>=2 & a<=4){
            System.out.println(a + " рубля");
        } else if(a > 4){
            System.out.println(a + " рублей" );
        }

    }
}
