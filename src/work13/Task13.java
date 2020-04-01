package work13;

public class Task13 {
    public static void main(String[] args) {
        int flag = 0;
        int x = (int)(Math.random() * 100);
        System.out.println("Число которое будет проверенно : " + x);
        int a = 0;
        a = x;
        for(int i = 2 ; i < x/2 ; i++){
            if( x % i == 0){
                flag  = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println("Число " + a + " является составныи") ;
        } else{
            System.out.println("Число " + a + " является простым");
        }
        }
    }

