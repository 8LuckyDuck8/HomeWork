package work9;

public class Task9 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 0;
        int x = (int)(Math.random() * 20);
        sum = x;
        while(x != 0){
            System.out.print(x + " ");
            if(sum < x){
                sum = x;
            }
            x = (int)(Math.random() * 20);

        }
        System.out.println();
        System.out.println("Наибольшее число: " + sum);

    }

}
