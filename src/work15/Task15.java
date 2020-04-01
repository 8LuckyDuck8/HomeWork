package work15;

public class Task15 {
    public static void main(String[] args) {
        int[] elements = new int [20];
        for(int i = 0 ; i < elements.length ; i++ ){
            elements[i] = (int)(Math.random()*10 + 1);
            System.out.print(elements[i] + " ");
        }
        System.out.println();
        int maxElem = elements[0];
        int minElem = elements[0];
        int max = 0;
        int min = 0;
        for(int i = 0 ; i < elements.length ; i++ ){
            if(maxElem < elements[i]) {
                maxElem = elements[i];
                max = i;
            }
        }
        System.out.println("Номер максимального элемента: " + max);
        for(int i = 0 ; i < elements.length ; i++ ){
            if(minElem > elements[i]) {
                minElem = elements[i];
                min = i;
            }
        }
        System.out.println("Номер минимального элемента: " + min);
        int sum = 0;
        if(max > min) {
            for ( ; min < max ; min++){
                sum = elements[min] + sum;
            }
        }else{
            for ( ; max < min ; max++){
                sum = elements[max] + sum;
            }
        }
        System.out.println("Сумма элементов между минимальным и максимальным: " + sum);
    }

}
