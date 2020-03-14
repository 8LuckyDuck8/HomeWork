package WORK11;

public class Task11 {
    public static void main(String[] args) {
        int flag = 0;
        int x = (int)(Math.random() * 100);
        int a = 0;
        a = x;
        for(int i = 2 ; i < x/2 ; i++){
            if( x % i == 0){
                flag  = 1;
            }
        }
        if(flag == 1){
            System.out.println("Число " + a + " является составныи") ;
        } else{
            System.out.println("Число " + a + " является простым");
        }
    }
}
