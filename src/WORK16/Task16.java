package WORK16;

public class Task16 {
    public static void main(String[] args) {
        int[] elements = new int [10];
        for(int i = 0 ; i < elements.length ; i++ ){
            elements[i] = (int)(Math.random()*10 + 1);
            System.out.print(elements[i] + " ");
        }
        System.out.println();
        int swap;
        int n = elements.length;
        for (int i = 0 ; i < n/2 ; i++){
            swap = elements[n-i-1];
            elements[n-i-1] = elements[i];
            elements[i] = swap;
        }
        for(int i = 0 ; i < elements.length ; i++ ){
            System.out.print(elements[i] + " ");
        }
    }
}
