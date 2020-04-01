package work12;

public class Task12 {
    public static void main(String[] args) {
        int k = 1234245369;
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
